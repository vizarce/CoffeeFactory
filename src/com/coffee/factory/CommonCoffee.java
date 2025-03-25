package com.coffee.factory;

import com.coffee.factory.processing.CoffeeGrinder;
import com.coffee.factory.processing.CoffeeProcessingStage;

public abstract class CommonCoffee {
	
	CoffeeType coffeeType;
	int amountGr;
	boolean wanted;
	boolean ordered;
	boolean grinded;
	boolean made;
	boolean poured;
	CoffeeProcessingStage coffeeProcessingStage;
	CoffeeGrinder coffeeGrinder;
	
    public CommonCoffee() {}
    
	public CommonCoffee(CoffeeType coffeeType, int amountGr, 
			boolean wanted, boolean ordered, boolean grinded, boolean made, boolean poured,
			CoffeeProcessingStage coffeeProcessingStage) {
		this.coffeeType = coffeeType;
		this.amountGr = amountGr;
		this.wanted = wanted;
		this.ordered = ordered;
		this.grinded = grinded;
		this.made = made;
		this.poured = poured;
		this.coffeeProcessingStage = coffeeProcessingStage;
		this.coffeeGrinder = getCoffeeGrinder();
	}
	
	public final void drinkCupOfCoffee() {
		
		orderCoffee();
		grindCoffee();
		makeCoffee();
		pourIntoCup();
		servingCoffee();
	}	
	public abstract CoffeeGrinder getCoffeeGrinder();
	public abstract void orderCoffee();
	public abstract void grindCoffee();
    public abstract void makeCoffee();
    public abstract void pourIntoCup();
    public void servingCoffee() {
    	System.out.println("Dear Customer, your Coffee is alredy made and poured in the proper Cup. Here it is! Bon appetite!");
    }

}
