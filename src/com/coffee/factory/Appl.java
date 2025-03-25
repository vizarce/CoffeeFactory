package com.coffee.factory;

import com.coffee.factory.processing.CoffeeProcessingStage;
import com.coffee.factory.processing.CoffeeRobustness;

public class Appl {

	public static void main(String[] args) {
		CommonCoffee coffee01 = new Coffee(CoffeeType.CAFFE_LATTE, CoffeeRobustness.MIDDLE, 150, true, true, false, false, false, CoffeeProcessingStage.WANTED);
		CommonCoffee coffee02 = new Coffee(CoffeeType.CAPPUCCINO, CoffeeRobustness.LIGHT, 100, true, true, false, false, false, CoffeeProcessingStage.ORDERED);
		CommonCoffee coffee03 = new Coffee(CoffeeType.ESPRESSO, CoffeeRobustness.STRONG, 200, true, true, true, true, true, CoffeeProcessingStage.POURED);
		coffee01.drinkCupOfCoffee();
		coffee02.drinkCupOfCoffee();
		coffee03.drinkCupOfCoffee();

	}

}
