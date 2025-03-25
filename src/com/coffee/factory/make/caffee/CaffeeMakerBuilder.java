package com.coffee.factory.make.caffee;

import java.util.HashMap;
import java.util.Map;

import com.coffee.factory.Coffee;
import com.coffee.factory.CoffeeType;
import com.coffee.factory.processing.CoffeeRobustness;

public interface CaffeeMakerBuilder {
	
	public static final Coffee coffee = new Coffee();
	
	public static final Map<String, Integer> mainIngredients = null;
	public static final Map<String, Integer> additionalIngredients = null;
	
	public Coffee build();
	
	default Map<String, Integer> getMainIngredients(CoffeeType coffeeType, CoffeeRobustness coffeeRobustness) {
		Map<String, Integer> mainIngredientsQuantity = new HashMap<>();
		switch(coffeeType.name()) {
		case "CAFE_NOIR": {
			int caffeeAmount = new CaffeeRecipes.CafeNoirType().getCaffeeBeansROBUSTAAmountGr();
		}
		}
		return mainIngredientsQuantity;
	}

}
