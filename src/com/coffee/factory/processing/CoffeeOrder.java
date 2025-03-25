package com.coffee.factory.processing;

import java.math.BigDecimal;
import java.util.Scanner;

import com.coffee.factory.Coffee;
import com.coffee.factory.CoffeeType;

public class CoffeeOrder implements Order {

	private static int id;
	private Coffee coffee;
	private int age;
	private int quantity;
	private String orderNumber;
	private BigDecimal pricePerUnit;
	private BigDecimal totalPrice;
	
	public CoffeeOrder() {id++;}
	
	public CoffeeOrder(Coffee coffee) {
		id++;
		this.coffee = coffee;
	}

	public CoffeeOrder(Coffee coffee, int quantity, int age) {
		id++;
		this.coffee = coffee;
		this.quantity = quantity;
		this.age = age;
		this.orderNumber = this.getOrderNumber();
		this.pricePerUnit = this.getPricePerUnit();
		this.totalPrice = this.getTotalPrice();
	}

	
	public static int getId() {
		return id;
	}
	
	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getOrderNumber() {
		return "COFFEE-" + this.coffee.getCoffeeType() + "-" 
					+ this.coffee.getCoffeeRobustness() + "-" 
				+ String.valueOf(this.coffee.getCoffeeType().getPrice().doubleValue()).replace('.', '-') 
				+ String.valueOf(this.quantity) + String.valueOf(id);
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getAge() {
		return age;
	}
	
	public BigDecimal getPricePerUnit() {
		this.pricePerUnit = this.coffee.getCoffeeType().getPrice();
		return this.pricePerUnit;//coffee.getCoffeeType().getPrice();
	}

	public BigDecimal getTotalPrice() {
		return coffee.getCoffeeType().getPrice().multiply(BigDecimal.valueOf(Long.valueOf(String.valueOf(quantity))));
	}

	@Override
	public Order makeOrder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter your desired Coffee quantity bellow: ");
		int coffeeQuantity = scanner.nextInt();
		System.out.println("Please, enter your real age bellow: ");
		int customerAge = scanner.nextInt();
		CoffeeOrder order = null;
		if (customerAge < 18) {
			System.out.println("You must be 18 years old or elder to become allowed ordering Coffee!");
			System.exit(0);
		} else if (customerAge >= 18 && this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.ZERO) 
				|| this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.ORDERED) 
				|| this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.GRINDED) 
				|| this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.MADE) 
				|| this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.POURED)) {
			System.out.println("Probably, your Coffee has been already ordered! Please, check it.");
	    } else if (customerAge >= 18 && this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.WANTED)){
	    	this.coffee.setCoffeeProcessingStage(CoffeeProcessingStage.ORDERED);
			order = new CoffeeOrder(this.coffee, coffeeQuantity, customerAge);
			System.out.println("Your Coffee has been ordered:::" + order);
		} else {
			System.out.println("Something goes wrong while ordering!");
		}
		//scanner.close();
		return order;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoffeeOrder [");
		if (coffee != null) {
			builder.append("coffee = ");
			builder.append(coffee);
			builder.append(", ");
		}
		builder.append("age = ");
		builder.append(age);
		builder.append(", quantity = ");
		builder.append(quantity);
		builder.append(", ");
		builder.append("orderNumber = ");
		builder.append(orderNumber);
		if (pricePerUnit != null) {
			builder.append(", pricePerUnit = ");
			builder.append(pricePerUnit);
			builder.append(", ");
		}
		if (totalPrice != null) {
			builder.append(", totalPrice = ");
			builder.append(totalPrice);
		}
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		Coffee coffeeNew = new Coffee(CoffeeType.CAFFE_LATTE, CoffeeRobustness.MIDDLE, 150, true, false, false, false, false, CoffeeProcessingStage.WANTED);
		System.out.println("Actual Coffee Wanted:::" + coffeeNew);
		CoffeeOrder order = new CoffeeOrder(coffeeNew);
		order.makeOrder();
		System.out.println("Actual Coffee Order:::" + order);
		
		Coffee coffeeNew01 = new Coffee(CoffeeType.CAPPUCCINO, CoffeeRobustness.LIGHT, 100, true, true, false, false, false, CoffeeProcessingStage.ORDERED);
		System.out.println("Actual Coffee Wanted:::" + coffeeNew01);
		CoffeeOrder order01 = new CoffeeOrder(coffeeNew01);
		order01.makeOrder();
		System.out.println("Actual Coffee Order:::" + order01);
	}

}
