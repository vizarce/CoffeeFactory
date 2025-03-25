package com.coffee.factory.warehouse;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CaffeeWareHouse implements WareHouse, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7519806326003828671L;
	private MainIngredients mainIngredients;
	private AdditionalIngredients additionalIngredients;

	
	public CaffeeWareHouse() {
		this.mainIngredients = this.getMainIngredients();
		this.additionalIngredients = this.getAdditionalIngredients();
	}
		
	public CaffeeWareHouse(MainIngredients mainIngredients, AdditionalIngredients additionalIngredients) {
		this.mainIngredients = mainIngredients;
		this.additionalIngredients = additionalIngredients;
	}

	public static class MainIngredients implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -193390279734262838L;
		private CaffeeBeans caffeeBeans;
		private int caffeeBeansARABICAAmountGr = 1000;
		private int caffeeBeansROBUSTAAmountGr = 1500;
		private int waterAmountMl = 30000;
		private int sugarAmountGr = 5000;
		private int milkAmountMl = 5000;
		
		public MainIngredients() {
			this.caffeeBeansARABICAAmountGr = 1000;
			this.caffeeBeansROBUSTAAmountGr = 1500;
			this.waterAmountMl = 30000;
			this.sugarAmountGr = 5000;
			this.milkAmountMl = 5000;
		}
		
		public MainIngredients(CaffeeBeans caffeeBeans, int caffeeBeansAmountGr, int waterAmountMl, int sugarAmountGr, int milkAmountMl) {
			this.caffeeBeans = caffeeBeans;
			if (caffeeBeans.getBeansType().equalsIgnoreCase("ARABICA"))
				this.caffeeBeansARABICAAmountGr = this.caffeeBeansARABICAAmountGr + caffeeBeansAmountGr;
			else
				this.caffeeBeansROBUSTAAmountGr = this.caffeeBeansROBUSTAAmountGr + caffeeBeansAmountGr;
			this.waterAmountMl = this.waterAmountMl + waterAmountMl;
			this.sugarAmountGr = this.sugarAmountGr + sugarAmountGr;
			this.milkAmountMl = this.milkAmountMl + milkAmountMl;
		}
		
		public CaffeeBeans getCaffeeBeans() {
			return caffeeBeans;
		}

		public void setCaffeeBeans(CaffeeBeans caffeeBeans) {
			this.caffeeBeans = caffeeBeans;
		}

		public int getCaffeeBeansARABICAAmountGr() {
			return this.caffeeBeansARABICAAmountGr;
		}

		public void setCaffeeBeansARABICAAmountGr(int caffeeBeansARABICAAmountGr) {
			this.caffeeBeansARABICAAmountGr = this.caffeeBeansARABICAAmountGr + caffeeBeansARABICAAmountGr;
		}

		public int getCaffeeBeansROBUSTAAmountGr() {
			return this.caffeeBeansROBUSTAAmountGr;
		}

		public void setCaffeeBeansROBUSTAAmountGr(int caffeeBeansROBUSTAAmountGr) {
			this.caffeeBeansROBUSTAAmountGr = this.caffeeBeansROBUSTAAmountGr + caffeeBeansROBUSTAAmountGr;
		}

		public int getWaterAmountMl() {
			return waterAmountMl;
		}

		public void setWaterAmountMl(int waterAmountMl) {
			this.waterAmountMl = this.waterAmountMl + waterAmountMl;
		}

		public int getSugarAmountGr() {
			return sugarAmountGr;
		}

		public void setSugarAmountGr(int sugarAmountGr) {
			this.sugarAmountGr = this.sugarAmountGr + sugarAmountGr;
		}

		public int getMilkAmountMl() {
			return milkAmountMl;
		}

		public void setMilkAmountMl(int milkAmountMl) {
			this.milkAmountMl = this.milkAmountMl + milkAmountMl;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("MainIngredients [");
			if (caffeeBeans != null) {
				builder.append("caffeeBeans=");
				builder.append(caffeeBeans);
				builder.append(", ");
			}
			builder.append("caffeeBeansARABICAAmountGr=");
			builder.append(caffeeBeansARABICAAmountGr);
			builder.append(", caffeeBeansROBUSTAAmountGr=");
			builder.append(caffeeBeansROBUSTAAmountGr);
			builder.append(", waterAmountMl=");
			builder.append(waterAmountMl);
			builder.append(", sugarAmountGr=");
			builder.append(sugarAmountGr);
			builder.append(", milkAmountMl=");
			builder.append(milkAmountMl);
			builder.append("]");
			return builder.toString();
		}

	}
	
	public static class AdditionalIngredients implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -3790138597277776437L;
		private int saltAmountGr;
		private int cardamonAmountGr;
		private int cinnamonAmountGr; // ваніль
		private int butterAmountGr;
		private int nutmegAmountGr; // мускатний горіх
		private int cayennePepperAmountGr;
		private int gingerAmountGr; // імбир
		private int cocoaPowderAmountGr;
		private int iceCreamAmountGr;
		private int creamAmountGr;
		private int iceAmountGr;
		private int darkChocolateAmountGr;
		private int honeyAmountGr;
		private int starAnisAmountGr;
		private int clovesAmountGr; // гвоздика
		private int peppermintOilAmountMl; //мятна олія
		private int coconutOilAmountMl;
		private int lavenderOilAmountMl;
		private int hazelnutOilAmountMl;
		private int coconutWaterAmountMl;
		private int coconutMilkAmountMl;
		private int eggYalkAmountUnits;
		private int lemonJuiceAmountMl;
		private int fruitJuiceAmountMl;
		private int whiskeyAmountMl;
		private int amarettoAmountMl;
		private int mapleSyrupAmountMl; //кленовий сироп
		private int chocolateSyrupAmountMl;
		private int marshmallowsAmountGr; // зефір
		
		public AdditionalIngredients() {
			this.saltAmountGr = 100;
			this.cardamonAmountGr = 300;
			this.cinnamonAmountGr = 150;
			this.butterAmountGr = 200;
			this.nutmegAmountGr = 250;
			this.cayennePepperAmountGr = 100;
			this.gingerAmountGr = 150;
			this.cocoaPowderAmountGr = 500;
			this.iceCreamAmountGr = 1000;
			this.creamAmountGr = 500;
			this.iceAmountGr = 1000;
			this.darkChocolateAmountGr = 500;
			this.honeyAmountGr = 500;
			this.starAnisAmountGr = 50;
			this.clovesAmountGr = 100;
			this.peppermintOilAmountMl = 50;
			this.coconutOilAmountMl = 150;
			this.lavenderOilAmountMl = 150;
			this.hazelnutOilAmountMl = 200;
			this.coconutWaterAmountMl = 250;
			this.coconutMilkAmountMl = 200;
			this.eggYalkAmountUnits = 5;
			this.lemonJuiceAmountMl = 500;
			this.fruitJuiceAmountMl = 500;
			this.whiskeyAmountMl = 700;
			this.amarettoAmountMl = 700;
			this.mapleSyrupAmountMl = 150;
			this.chocolateSyrupAmountMl = 500;
			this.marshmallowsAmountGr = 500;
		}
		
		public AdditionalIngredients(int saltAmountGr, int cardamonAmountGr, int cinnamonAmountGr, int butterAmountGr,
				int nutmegAmountGr, int cayennePepperAmountGr, int gingerAmountGr, int cocoaPowderAmountGr,
				int iceCreamAmountGr, int creamAmountGr, int iceAmountGr, int darkChocolateAmountGr, int honeyAmountGr,
				int starAnisAmountGr, int clovesAmountGr, int peppermintOilAmountMl, int coconutOilAmountMl,
				int lavenderOilAmountMl, int hazelnutOilAmountMl, int coconutWaterAmountMl, int coconutMilkAmountMl,
				int eggYalkAmountUnits, int lemonJuiceAmountMl, int fruitJuiceAmountMl, int whiskeyAmountMl,
				int amarettoAmountMl, int mapleSyrupAmountMl, int chocolateSyrupAmountMl, int marshmallowsAmountGr) {
			super();
			this.saltAmountGr = this.saltAmountGr + saltAmountGr;
			this.cardamonAmountGr = this.cardamonAmountGr + cardamonAmountGr;
			this.cinnamonAmountGr = this.cinnamonAmountGr + cinnamonAmountGr;
			this.butterAmountGr = this.butterAmountGr + butterAmountGr;
			this.nutmegAmountGr = this.nutmegAmountGr + nutmegAmountGr;
			this.cayennePepperAmountGr = this.cayennePepperAmountGr + cayennePepperAmountGr;
			this.gingerAmountGr = this.gingerAmountGr + gingerAmountGr;
			this.cocoaPowderAmountGr = this.cocoaPowderAmountGr + cocoaPowderAmountGr;
			this.iceCreamAmountGr = this.iceCreamAmountGr + iceCreamAmountGr;
			this.creamAmountGr = this.creamAmountGr + creamAmountGr;
			this.iceAmountGr = this.iceAmountGr + iceAmountGr;
			this.darkChocolateAmountGr = this.darkChocolateAmountGr + darkChocolateAmountGr;
			this.honeyAmountGr = this.honeyAmountGr + honeyAmountGr;
			this.starAnisAmountGr = this.starAnisAmountGr + starAnisAmountGr;
			this.clovesAmountGr = this.clovesAmountGr + clovesAmountGr;
			this.peppermintOilAmountMl = this.peppermintOilAmountMl + peppermintOilAmountMl;
			this.coconutOilAmountMl = this.coconutOilAmountMl + coconutOilAmountMl;
			this.lavenderOilAmountMl = this.lavenderOilAmountMl + lavenderOilAmountMl;
			this.hazelnutOilAmountMl = this.hazelnutOilAmountMl + hazelnutOilAmountMl;
			this.coconutWaterAmountMl = this.coconutWaterAmountMl + coconutWaterAmountMl;
			this.coconutMilkAmountMl = this.coconutMilkAmountMl + coconutMilkAmountMl;
			this.eggYalkAmountUnits = this.eggYalkAmountUnits + eggYalkAmountUnits;
			this.lemonJuiceAmountMl = this.lemonJuiceAmountMl + lemonJuiceAmountMl;
			this.fruitJuiceAmountMl = this.fruitJuiceAmountMl + fruitJuiceAmountMl;
			this.whiskeyAmountMl = this.whiskeyAmountMl + whiskeyAmountMl;
			this.amarettoAmountMl = this.amarettoAmountMl + amarettoAmountMl;
			this.mapleSyrupAmountMl = this.mapleSyrupAmountMl + mapleSyrupAmountMl;
			this.chocolateSyrupAmountMl = this.chocolateSyrupAmountMl + chocolateSyrupAmountMl;
			this.marshmallowsAmountGr = this.marshmallowsAmountGr + marshmallowsAmountGr;
		}

		public int getSaltAmountGr() {
			return saltAmountGr;
		}

		public void setSaltAmountGr(int saltAmountGr) {
			this.saltAmountGr = this.saltAmountGr + saltAmountGr;
		}

		public int getCardamonAmountGr() {
			return cardamonAmountGr;
		}

		public void setCardamonAmountGr(int cardamonAmountGr) {
			this.cardamonAmountGr = this.cardamonAmountGr + cardamonAmountGr;
		}

		public int getCinnamonAmountGr() {
			return cinnamonAmountGr;
		}

		public void setCinnamonAmountGr(int cinnamonAmountGr) {
			this.cinnamonAmountGr = this.cinnamonAmountGr + cinnamonAmountGr;
		}

		public int getButterAmountGr() {
			return butterAmountGr;
		}

		public void setButterAmountGr(int butterAmountGr) {
			this.butterAmountGr = this.butterAmountGr + butterAmountGr;
		}

		public int getNutmegAmountGr() {
			return nutmegAmountGr;
		}

		public void setNutmegAmountGr(int nutmegAmountGr) {
			this.nutmegAmountGr = this.nutmegAmountGr + nutmegAmountGr;
		}

		public int getCayennePepperAmountGr() {
			return cayennePepperAmountGr;
		}

		public void setCayennePepperAmountGr(int cayennePepperAmountGr) {
			this.cayennePepperAmountGr = this.cayennePepperAmountGr + cayennePepperAmountGr;
		}

		public int getGingerAmountGr() {
			return gingerAmountGr;
		}

		public void setGingerAmountGr(int gingerAmountGr) {
			this.gingerAmountGr = this.gingerAmountGr + gingerAmountGr;
		}

		public int getCocoaPowderAmountGr() {
			return cocoaPowderAmountGr;
		}

		public void setCocoaPowderAmountGr(int cocoaPowderAmountGr) {
			this.cocoaPowderAmountGr = this.cocoaPowderAmountGr + cocoaPowderAmountGr;
		}

		public int getIceCreamAmountGr() {
			return iceCreamAmountGr;
		}

		public void setIceCreamAmountGr(int iceCreamAmountGr) {
			this.iceCreamAmountGr = this.iceCreamAmountGr + iceCreamAmountGr;
		}

		public int getCreamAmountGr() {
			return creamAmountGr;
		}

		public void setCreamAmountGr(int creamAmountGr) {
			this.creamAmountGr = this.creamAmountGr + creamAmountGr;
		}

		public int getIceAmountGr() {
			return iceAmountGr;
		}

		public void setIceAmountGr(int iceAmountGr) {
			this.iceAmountGr = this.iceAmountGr + iceAmountGr;
		}

		public int getDarkChocolateAmountGr() {
			return darkChocolateAmountGr;
		}

		public void setDarkChocolateAmountGr(int darkChocolateAmountGr) {
			this.darkChocolateAmountGr = this.darkChocolateAmountGr + darkChocolateAmountGr;
		}

		public int getHoneyAmountGr() {
			return honeyAmountGr;
		}

		public void setHoneyAmountGr(int honeyAmountGr) {
			this.honeyAmountGr = this.honeyAmountGr + honeyAmountGr;
		}

		public int getStarAnisAmountGr() {
			return starAnisAmountGr;
		}

		public void setStarAnisAmountGr(int starAnisAmountGr) {
			this.starAnisAmountGr = this.starAnisAmountGr + starAnisAmountGr;
		}

		public int getClovesAmountGr() {
			return clovesAmountGr;
		}

		public void setClovesAmountGr(int clovesAmountGr) {
			this.clovesAmountGr = this.clovesAmountGr + clovesAmountGr;
		}

		public int getPeppermintOilAmountMl() {
			return peppermintOilAmountMl;
		}

		public void setPeppermintOilAmountMl(int peppermintOilAmountMl) {
			this.peppermintOilAmountMl = this.peppermintOilAmountMl + peppermintOilAmountMl;
		}

		public int getCoconutOilAmountMl() {
			return coconutOilAmountMl;
		}

		public void setCoconutOilAmountMl(int coconutOilAmountMl) {
			this.coconutOilAmountMl = this.coconutOilAmountMl + coconutOilAmountMl;
		}

		public int getLavenderOilAmountMl() {
			return lavenderOilAmountMl;
		}

		public void setLavenderOilAmountMl(int lavenderOilAmountMl) {
			this.lavenderOilAmountMl = this.lavenderOilAmountMl + lavenderOilAmountMl;
		}

		public int getHazelnutOilAmountMl() {
			return hazelnutOilAmountMl;
		}

		public void setHazelnutOilAmountMl(int hazelnutOilAmountMl) {
			this.hazelnutOilAmountMl = this.hazelnutOilAmountMl + hazelnutOilAmountMl;
		}

		public int getCoconutWaterAmountMl() {
			return coconutWaterAmountMl;
		}

		public void setCoconutWaterAmountMl(int coconutWaterAmountMl) {
			this.coconutWaterAmountMl = this.coconutWaterAmountMl + coconutWaterAmountMl;
		}

		public int getCoconutMilkAmountMl() {
			return coconutMilkAmountMl;
		}

		public void setCoconutMilkAmountMl(int coconutMilkAmountMl) {
			this.coconutMilkAmountMl = this.coconutMilkAmountMl + coconutMilkAmountMl;
		}

		public int getEggYalkAmountUnits() {
			return eggYalkAmountUnits;
		}

		public void setEggYalkAmountUnits(int eggYalkAmountUnits) {
			this.eggYalkAmountUnits = this.eggYalkAmountUnits + eggYalkAmountUnits;
		}

		public int getLemonJuiceAmountMl() {
			return lemonJuiceAmountMl;
		}

		public void setLemonJuiceAmountMl(int lemonJuiceAmountMl) {
			this.lemonJuiceAmountMl = this.lemonJuiceAmountMl + lemonJuiceAmountMl;
		}

		public int getFruitJuiceAmountMl() {
			return fruitJuiceAmountMl;
		}

		public void setFruitJuiceAmountMl(int fruitJuiceAmountMl) {
			this.fruitJuiceAmountMl = this.fruitJuiceAmountMl + fruitJuiceAmountMl;
		}

		public int getWhiskeyAmountMl() {
			return whiskeyAmountMl;
		}

		public void setWhiskeyAmountMl(int whiskeyAmountMl) {
			this.whiskeyAmountMl = this.whiskeyAmountMl + whiskeyAmountMl;
		}

		public int getAmarettoAmountMl() {
			return amarettoAmountMl;
		}

		public void setAmarettoAmountMl(int amarettoAmountMl) {
			this.amarettoAmountMl = this.amarettoAmountMl + amarettoAmountMl;
		}

		public int getMapleSyrupAmountMl() {
			return mapleSyrupAmountMl;
		}

		public void setMapleSyrupAmountMl(int mapleSyrupAmountMl) {
			this.mapleSyrupAmountMl = this.mapleSyrupAmountMl + mapleSyrupAmountMl;
		}

		public int getChocolateSyrupAmountMl() {
			return chocolateSyrupAmountMl;
		}

		public void setChocolateSyrupAmountMl(int chocolateSyrupAmountMl) {
			this.chocolateSyrupAmountMl = this.chocolateSyrupAmountMl + chocolateSyrupAmountMl;
		}

		public int getMarshmallowsAmountGr() {
			return marshmallowsAmountGr;
		}

		public void setMarshmallowsAmountGr(int marshmallowsAmountGr) {
			this.marshmallowsAmountGr = this.marshmallowsAmountGr + marshmallowsAmountGr;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("AdditionalIngredients [saltAmountGr=");
			builder.append(saltAmountGr);
			builder.append(", cardamonAmountGr=");
			builder.append(cardamonAmountGr);
			builder.append(", cinnamonAmountGr=");
			builder.append(cinnamonAmountGr);
			builder.append(", butterAmountGr=");
			builder.append(butterAmountGr);
			builder.append(", nutmegAmountGr=");
			builder.append(nutmegAmountGr);
			builder.append(", cayennePepperAmountGr=");
			builder.append(cayennePepperAmountGr);
			builder.append(", gingerAmountGr=");
			builder.append(gingerAmountGr);
			builder.append(", cocoaPowderAmountGr=");
			builder.append(cocoaPowderAmountGr);
			builder.append(", iceCreamAmountGr=");
			builder.append(iceCreamAmountGr);
			builder.append(", creamAmountGr=");
			builder.append(creamAmountGr);
			builder.append(", iceAmountGr=");
			builder.append(iceAmountGr);
			builder.append(", darkChocolateAmountGr=");
			builder.append(darkChocolateAmountGr);
			builder.append(", honeyAmountGr=");
			builder.append(honeyAmountGr);
			builder.append(", starAnisAmountGr=");
			builder.append(starAnisAmountGr);
			builder.append(", clovesAmountGr=");
			builder.append(clovesAmountGr);
			builder.append(", peppermintOilAmountMl=");
			builder.append(peppermintOilAmountMl);
			builder.append(", coconutOilAmountMl=");
			builder.append(coconutOilAmountMl);
			builder.append(", lavenderOilAmountMl=");
			builder.append(lavenderOilAmountMl);
			builder.append(", hazelnutOilAmountMl=");
			builder.append(hazelnutOilAmountMl);
			builder.append(", coconutWaterAmountMl=");
			builder.append(coconutWaterAmountMl);
			builder.append(", coconutMilkAmountMl=");
			builder.append(coconutMilkAmountMl);
			builder.append(", eggYalkAmountUnits=");
			builder.append(eggYalkAmountUnits);
			builder.append(", lemonJuiceAmountMl=");
			builder.append(lemonJuiceAmountMl);
			builder.append(", fruitJuiceAmountMl=");
			builder.append(fruitJuiceAmountMl);
			builder.append(", whiskeyAmountMl=");
			builder.append(whiskeyAmountMl);
			builder.append(", amarettoAmountMl=");
			builder.append(amarettoAmountMl);
			builder.append(", mapleSyrupAmountMl=");
			builder.append(mapleSyrupAmountMl);
			builder.append(", chocolateSyrupAmountMl=");
			builder.append(chocolateSyrupAmountMl);
			builder.append(", marshmallowsAmountGr=");
			builder.append(marshmallowsAmountGr);
			builder.append("]");
			return builder.toString();
		}
		
	}
	
	public MainIngredients getMainIngredients() {
		return this.mainIngredients;
	}

	public void setMainIngredients(MainIngredients mainIngredients) {
		this.mainIngredients = mainIngredients;
	}

	public AdditionalIngredients getAdditionalIngredients() {
		return this.additionalIngredients;
	}

	public void setAdditionalIngredients(AdditionalIngredients additionalIngredients) {
		this.additionalIngredients = additionalIngredients;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaffeeWareHouse [");
		if (mainIngredients != null) {
			builder.append("mainIngredients=");
			builder.append(mainIngredients);
			builder.append(", ");
		}
		if (additionalIngredients != null) {
			builder.append("additionalIngredients=");
			builder.append(additionalIngredients);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int takeIngredient(IngredientType ingredientType, String ingredient, Integer quantity) {
		int amount = 0;
		if (quantity.getClass().getName().equalsIgnoreCase("java.lang.Integer")) {
			if(ingredientType.toString().equalsIgnoreCase("MAIN")) {
				if (getMainIngredientsList().contains(ingredient)) {
					switch(ingredient) {
						case "caffeeBeansARABICA": {
							if (quantity <= this.getMainIngredients().getCaffeeBeansARABICAAmountGr()) {
								int actualAmount = this.mainIngredients.caffeeBeansARABICAAmountGr;
								this.mainIngredients.caffeeBeansARABICAAmountGr = actualAmount - quantity;
								amount = quantity;
							} else {
								throw new IllegalArgumentException("The desired amount of the Ingredient must be less than stores in CaffeeWareHouse!");
							}
							break;
						}
						case "caffeeBeansROBUSTA": {
							if (quantity <= this.getMainIngredients().getCaffeeBeansROBUSTAAmountGr()) {
								int actualAmount = this.mainIngredients.caffeeBeansROBUSTAAmountGr;
								this.mainIngredients.caffeeBeansROBUSTAAmountGr = actualAmount - quantity;
								amount = quantity;
								System.out.println(amount);
							} else {
								throw new IllegalArgumentException("The desired amount of the Ingredient must be less than stores in CaffeeWareHouse!");
							}
							break;
						}
						case "water": {
							System.out.println(quantity <= this.getMainIngredients().getWaterAmountMl());
							if (quantity <= this.getMainIngredients().getWaterAmountMl()) {
								int actualAmount = this.mainIngredients.waterAmountMl;
								this.mainIngredients.waterAmountMl = actualAmount - quantity;
								amount = quantity;
							} else {
								throw new IllegalArgumentException("The desired amount of the Ingredient must be less than stores in CaffeeWareHouse!");
							}
							break;
						}
						case "sugar": {
							if (quantity <= this.getMainIngredients().getSugarAmountGr()) {
								int actualAmount = this.mainIngredients.sugarAmountGr;
								this.mainIngredients.sugarAmountGr = actualAmount - quantity;
								amount = quantity;
							} else {
								throw new IllegalArgumentException("The desired amount of the Ingredient must be less than stores in CaffeeWareHouse!");
							}
							break;
						}
						case "milk": {
							if (quantity <= this.getMainIngredients().getMilkAmountMl()) {
								int actualAmount = this.mainIngredients.milkAmountMl;
								this.mainIngredients.milkAmountMl = actualAmount - quantity;
								amount = quantity;
							} else {
								throw new IllegalArgumentException("The desired amount of the Ingredient must be less than stores in CaffeeWareHouse!");
							}
							break;
						}
					}
				} else {
					throw new IllegalArgumentException("It has been given wrong name of the Ingredient!");
				}
				System.out.println("You can now receive desired  quantity = " + quantity + " of the Ingredient: " + ingredient + " from the Main section of CaffeeWareHouse!");
			} else {
				if (getAdditionalIngredientsList().contains(ingredient)) {
					if (ingredient.equalsIgnoreCase("salt") && quantity <= this.getAdditionalIngredients().getSaltAmountGr()) {
						this.additionalIngredients.saltAmountGr = this.additionalIngredients.saltAmountGr - quantity; 
					} else if (ingredient.equalsIgnoreCase("cardamon") && quantity <= this.getAdditionalIngredients().getCardamonAmountGr()) {
						this.additionalIngredients.cardamonAmountGr = this.additionalIngredients.cardamonAmountGr - quantity; 
					} else if (ingredient.equalsIgnoreCase("cinnamon") && quantity <= this.getAdditionalIngredients().getCinnamonAmountGr()) {
						this.additionalIngredients.cinnamonAmountGr = this.additionalIngredients.cinnamonAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("butter") && quantity <= this.getAdditionalIngredients().getButterAmountGr()) {
						this.additionalIngredients.butterAmountGr = this.additionalIngredients.butterAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("nutmeg") && quantity <= this.getAdditionalIngredients().getNutmegAmountGr()) {
						this.additionalIngredients.nutmegAmountGr = this.additionalIngredients.nutmegAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("cayennePepper") && quantity <= this.getAdditionalIngredients().getCayennePepperAmountGr()) {
						this.additionalIngredients.cayennePepperAmountGr = this.additionalIngredients.cayennePepperAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("ginger") && quantity <= this.getAdditionalIngredients().getGingerAmountGr()) {
						this.additionalIngredients.gingerAmountGr = this.additionalIngredients.gingerAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("cocoaPowder") && quantity <= this.getAdditionalIngredients().getCocoaPowderAmountGr()) {
						this.additionalIngredients.cocoaPowderAmountGr = this.additionalIngredients.cocoaPowderAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("iceCream") && quantity <= this.getAdditionalIngredients().getIceAmountGr()) {
						this.additionalIngredients.iceCreamAmountGr = this.additionalIngredients.iceCreamAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("cream") && quantity <= this.getAdditionalIngredients().getCreamAmountGr()) {
						this.additionalIngredients.creamAmountGr = this.additionalIngredients.creamAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("ice") && quantity <= this.getAdditionalIngredients().getIceAmountGr()) {
						this.additionalIngredients.iceAmountGr = this.additionalIngredients.iceAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("darkChocolate") && quantity <= this.getAdditionalIngredients().getDarkChocolateAmountGr()) {
						this.additionalIngredients.darkChocolateAmountGr = this.additionalIngredients.darkChocolateAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("honey") && quantity <= this.getAdditionalIngredients().getHoneyAmountGr()) {
						this.additionalIngredients.honeyAmountGr = this.additionalIngredients.honeyAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("starAnis") && quantity <= this.getAdditionalIngredients().getStarAnisAmountGr()) {
						this.additionalIngredients.starAnisAmountGr = this.additionalIngredients.starAnisAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("cloves") && quantity <= this.getAdditionalIngredients().getClovesAmountGr()) {
						this.additionalIngredients.clovesAmountGr = this.additionalIngredients.clovesAmountGr - quantity;
					} else if (ingredient.equalsIgnoreCase("peppermintOil") && quantity <= this.getAdditionalIngredients().getPeppermintOilAmountMl()) {
						this.additionalIngredients.peppermintOilAmountMl = this.additionalIngredients.peppermintOilAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("coconutOil") && quantity <= this.getAdditionalIngredients().getCoconutOilAmountMl()) {
						this.additionalIngredients.coconutOilAmountMl = this.additionalIngredients.coconutOilAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("lavenderOil") && quantity <= this.getAdditionalIngredients().getLavenderOilAmountMl()) {
						this.additionalIngredients.lavenderOilAmountMl = this.additionalIngredients.lavenderOilAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("hazelnutOil") && quantity <= this.getAdditionalIngredients().getHazelnutOilAmountMl()) {
						this.additionalIngredients.hazelnutOilAmountMl = this.additionalIngredients.hazelnutOilAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("coconutWater") && quantity <= this.getAdditionalIngredients().getCoconutWaterAmountMl()) {
						this.additionalIngredients.coconutWaterAmountMl = this.additionalIngredients.coconutWaterAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("coconutMilk") && quantity <= this.getAdditionalIngredients().getCoconutMilkAmountMl()) {
						this.additionalIngredients.coconutMilkAmountMl = this.additionalIngredients.coconutMilkAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("eggYalk") && quantity <= this.getAdditionalIngredients().getEggYalkAmountUnits()) {
						this.additionalIngredients.eggYalkAmountUnits = this.additionalIngredients.eggYalkAmountUnits - quantity;
					} else if (ingredient.equalsIgnoreCase("lemonJuice") && quantity <= this.getAdditionalIngredients().getLemonJuiceAmountMl()) {
						this.additionalIngredients.lemonJuiceAmountMl = this.additionalIngredients.lemonJuiceAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("fruitJuice") && quantity <= this.getAdditionalIngredients().getFruitJuiceAmountMl()) {
						this.additionalIngredients.fruitJuiceAmountMl = this.additionalIngredients.fruitJuiceAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("whiskey") && quantity <= this.getAdditionalIngredients().getWhiskeyAmountMl()) {
						this.additionalIngredients.whiskeyAmountMl = this.additionalIngredients.whiskeyAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("amaretto") && quantity <= this.getAdditionalIngredients().getAmarettoAmountMl()) {
						this.additionalIngredients.amarettoAmountMl = this.additionalIngredients.amarettoAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("mapleSyrup") && quantity <= this.getAdditionalIngredients().getMapleSyrupAmountMl()) {
						this.additionalIngredients.mapleSyrupAmountMl = this.additionalIngredients.mapleSyrupAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("chocolateSyrup") && quantity <= this.getAdditionalIngredients().getChocolateSyrupAmountMl()) {
						this.additionalIngredients.chocolateSyrupAmountMl = this.additionalIngredients.chocolateSyrupAmountMl - quantity;
					} else if (ingredient.equalsIgnoreCase("marshmallows") && quantity <= this.getAdditionalIngredients().getMarshmallowsAmountGr()) {
						this.additionalIngredients.marshmallowsAmountGr = this.additionalIngredients.marshmallowsAmountGr - quantity;
					} else {
						amount = 0;
						throw new IllegalArgumentException("The desired amount of the Ingredient must be less than stores in CaffeeWareHouse! Or it has been given the wrong name of the Ingredient!");
					}
					amount = quantity;
					System.out.println("You can now receive desired  quantity = " + quantity + " of the Ingredient: " + ingredient + " from the Additional section of CaffeeWareHouse!");
				} else {
					throw new IllegalArgumentException("It has been given the wrong name of the Ingredient!");
				}
			} 
		} else {
			throw new IllegalArgumentException("There was incorrect type of the Ingredients quantity provided. Requred type is Integer!");
		}
		return amount;
	}

	@Override
	public void addIngredient(IngredientType ingredientType, String ingredient, Integer quantity) {
		if (quantity.getClass().getName().equalsIgnoreCase("java.lang.Integer")) {
			if(ingredientType.toString().equalsIgnoreCase("MAIN")) {
				if (getMainIngredientsList().contains(ingredient)) {
					if (ingredient.equalsIgnoreCase("caffeeBeansARABICA"))
						this.mainIngredients.setCaffeeBeansARABICAAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("caffeeBeansROBUSTA"))
						this.mainIngredients.setCaffeeBeansROBUSTAAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("water"))
						this.mainIngredients.setWaterAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("sugar"))
						this.mainIngredients.setSugarAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("milk"))
						this.mainIngredients.setMilkAmountMl(quantity);
					else
						throw new IllegalArgumentException("It has been given the wrong name of the Ingredient!");
					System.out.println("The  quantity = " + quantity + " of the Ingredient: " + ingredient + " was successfully added to the Main section of CaffeeWareHouse!");
				} else {
					throw new IllegalArgumentException("It has been given the wrong name of the Ingredient!");
				}
			} else {
				if (getAdditionalIngredientsList().contains(ingredient)) {
					if (ingredient.equalsIgnoreCase("salt"))
						this.additionalIngredients.setSaltAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("cardamon"))
						this.additionalIngredients.setCardamonAmountGr(quantity); 
					else if (ingredient.equalsIgnoreCase("cinnamon"))
						this.additionalIngredients.setCinnamonAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("butter"))
						this.additionalIngredients.setButterAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("nutmeg"))
						this.additionalIngredients.setNutmegAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("cayennePepper"))
						this.additionalIngredients.setCayennePepperAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("ginger"))
						this.additionalIngredients.setGingerAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("cocoaPowder"))
						this.additionalIngredients.setCocoaPowderAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("iceCream"))
						this.additionalIngredients.setIceCreamAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("cream"))
						this.additionalIngredients.setCreamAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("ice"))
						this.additionalIngredients.setIceAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("darkChocolate"))
						this.additionalIngredients.setDarkChocolateAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("honey"))
						this.additionalIngredients.setHoneyAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("starAnis"))
						this.additionalIngredients.setStarAnisAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("cloves"))
						this.additionalIngredients.setClovesAmountGr(quantity);
					else if (ingredient.equalsIgnoreCase("peppermintOil"))
						this.additionalIngredients.setPeppermintOilAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("coconutOil"))
						this.additionalIngredients.setCoconutOilAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("lavenderOil"))
						this.additionalIngredients.setLavenderOilAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("hazelnutOil"))
						this.additionalIngredients.setHazelnutOilAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("coconutWater"))
						this.additionalIngredients.setCoconutWaterAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("coconutMilk"))
						this.additionalIngredients.setCoconutMilkAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("eggYalk"))
						this.additionalIngredients.setEggYalkAmountUnits(quantity);
					else if (ingredient.equalsIgnoreCase("lemonJuice"))
						this.additionalIngredients.setLemonJuiceAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("fruitJuice"))
						this.additionalIngredients.setFruitJuiceAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("whiskey"))
						this.additionalIngredients.setWhiskeyAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("amaretto"))
						this.additionalIngredients.setAmarettoAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("mapleSyrup"))
						this.additionalIngredients.setMapleSyrupAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("chocolateSyrup"))
						this.additionalIngredients.setChocolateSyrupAmountMl(quantity);
					else if (ingredient.equalsIgnoreCase("marshmallows"))
						this.additionalIngredients.setMarshmallowsAmountGr(quantity);
					else
						throw new IllegalArgumentException("It has been given the wrong name of the Ingredient!");
					System.out.println("The  quantity = " + quantity + " of the Ingredient: " + ingredient + " was successfully added to the Additional section of CaffeeWareHouse!");
				} else {
					throw new IllegalArgumentException("It has been given the wrong name of the Ingredient!");
				}
			}
		} else {
			throw new IllegalArgumentException("There was incorrect type of the Ingredients quantity provided. Requred type is Integer!");
		}
	}
	
	public static ArrayList<String> getMainIngredientsList() {
		Field[] mainIngregientsfields = CaffeeWareHouse.MainIngredients.class.getDeclaredFields();
		Arrays.stream(mainIngregientsfields).forEach(field -> field.setAccessible(true));
		return Arrays.stream(mainIngregientsfields)
				.map(field -> field.getName())
				.map(str -> str.replace("AmountGr", "").replace("AmountMl", "").replace("AmountUnits", ""))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static ArrayList<String> getAdditionalIngredientsList() {
		Field[] additionalIngregientsfields = CaffeeWareHouse.AdditionalIngredients.class.getDeclaredFields();
		Arrays.stream(additionalIngregientsfields).forEach(field -> field.setAccessible(true));
		return Arrays.stream(additionalIngregientsfields)
				.map(field -> field.getName())
				.map(str -> str.replace("AmountGr", "").replace("AmountMl", "").replace("AmountUnits", ""))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	
	public static CaffeeWareHouse getInstance() {
		CaffeeWareHouse.MainIngredients mainIngredients = new CaffeeWareHouse.MainIngredients();
		CaffeeWareHouse.AdditionalIngredients additionalIngredients = new CaffeeWareHouse.AdditionalIngredients();
		CaffeeWareHouse caffeeWareHouse = new CaffeeWareHouse(mainIngredients, additionalIngredients);
		return caffeeWareHouse;
	}

	
	

}


