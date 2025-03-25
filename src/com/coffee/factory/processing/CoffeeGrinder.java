package com.coffee.factory.processing;

import com.coffee.factory.Coffee;
import com.coffee.factory.CoffeeType;

public class CoffeeGrinder implements Grinder {
	
	private Coffee coffee;
	private CoffeeProcessingStage coffeeProcessingStage;
	private Coffee grindedCoffee;
	
	public CoffeeGrinder(Coffee coffee) {
		this.coffee = coffee;
		this.coffeeProcessingStage = this.coffee.getCoffeeProcessingStage(); 
		this.grindedCoffee = this.grind();
	}

	public Coffee getCoffee() {
		return coffee;
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public Coffee getGrindedCoffee() {
		CoffeeGrinder coffeeGrinder = new CoffeeGrinder(this.coffee);
		return coffeeGrinder.grind();
	}

	@Override
	public Coffee grind() {
		//CoffeeGrinder coffeeGrinder = new CoffeeGrinder(coffee);
		if (this.coffee.isWanted() && this.coffee.isOrdered() && !this.coffee.isGrinded() 
				&& !this.coffee.isMade() && !this.coffee.isPoured() && this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.ORDERED)) {
			this.coffee.setCoffeeType(this.coffee.getCoffeeType());
			this.coffee.setAmountGr(this.coffee.getAmountGr());
			this.coffee.setGrinded(true);
			this.coffee.setCoffeeProcessingStage(CoffeeProcessingStage.GRINDED);
			this.grindedCoffee = this.getGrindedCoffee();
		} else if (this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.WANTED)) {
			this.coffee.setCoffeeProcessingStage(this.coffee.getCoffeeProcessingStage());
			System.out.println("Firstly, you have to order Coffee before grinding it!");
		} else if (this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.MADE) || this.coffee.getCoffeeProcessingStage().equals(CoffeeProcessingStage.POURED)) {
			this.coffee.setCoffeeProcessingStage(this.coffee.getCoffeeProcessingStage());
			System.out.println("Your Coffee is already made and probably poured into the Cup!");
		}
		return this.coffee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoffeeGrinder [");
		if (this.coffee != null) {
			builder.append("coffee=");
			builder.append(coffee);
			builder.append(", ");
		}
		if (coffeeProcessingStage != null) {
			builder.append("coffeeProcessingStage=");
			builder.append(coffeeProcessingStage);
			builder.append(", ");
		}
		if (grindedCoffee != null) {
			builder.append("grindedCoffee=");
			builder.append(grindedCoffee);
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		Coffee coffeeNew01 = new Coffee(CoffeeType.CAPPUCCINO, CoffeeRobustness.LIGHT, 100, true, true, false, false, false, CoffeeProcessingStage.ORDERED);
		System.out.println("Actual Coffee Ordered:::" + coffeeNew01);
		coffeeNew01.grindCoffee();
		System.out.println("Actual Grinded Coffee Ordered:::" + coffeeNew01);
		CoffeeGrinder coffeeGrinder = new CoffeeGrinder(coffeeNew01);
		System.out.println("CoffeeGrinder Ordered:::" + coffeeGrinder);
	}
	
	
}
