package com.coffee.factory.make.caffee;

import java.util.Scanner;

import com.coffee.factory.warehouse.CaffeeBeans;

public class CaffeeMaker {
	
	private Scanner scanner;
	private CaffeeBeans caffeeBeans;
	private int caffeeBeansARABICAAmountGr;
	private int caffeeBeansROBUSTAAmountGr;
	private int waterAmountMl;
	private int sugarAmountGr;
	private int milkAmountMl;
	
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
	
	private CaffeeMaker(CaffeeMakerBuilder builder) {
		this.scanner = builder.scanner;
		this.caffeeBeans = builder.caffeeBeans;
		this.caffeeBeansARABICAAmountGr = builder.caffeeBeansARABICAAmountGr;
		this.caffeeBeansROBUSTAAmountGr = builder.caffeeBeansROBUSTAAmountGr;
		this.waterAmountMl = builder.waterAmountMl;
		this.sugarAmountGr = builder.sugarAmountGr;
		this.milkAmountMl = builder.milkAmountMl;
		this.saltAmountGr = builder.saltAmountGr;
		this.cardamonAmountGr = builder.cardamonAmountGr;
		this.cinnamonAmountGr = builder.cinnamonAmountGr;
		this.butterAmountGr = builder.butterAmountGr;
		this.nutmegAmountGr = builder.nutmegAmountGr;
		this.cayennePepperAmountGr = builder.cayennePepperAmountGr;
		this.gingerAmountGr = builder.gingerAmountGr;
		this.cocoaPowderAmountGr = builder.cocoaPowderAmountGr;
		this.iceCreamAmountGr = builder.iceCreamAmountGr;
		this.creamAmountGr = builder.creamAmountGr;
		this.iceAmountGr = builder.iceAmountGr;
		this.darkChocolateAmountGr = builder.darkChocolateAmountGr;
		this.honeyAmountGr = builder.honeyAmountGr;
		this.starAnisAmountGr = builder.starAnisAmountGr;
		this.clovesAmountGr = builder.clovesAmountGr;
		this.peppermintOilAmountMl = builder.peppermintOilAmountMl;
		this.coconutOilAmountMl = builder.coconutOilAmountMl;
		this.lavenderOilAmountMl = builder.lavenderOilAmountMl;
		this.hazelnutOilAmountMl = builder.hazelnutOilAmountMl;
		this.coconutWaterAmountMl = builder.coconutWaterAmountMl;
		this.coconutMilkAmountMl = builder.coconutMilkAmountMl;
		this.eggYalkAmountUnits = builder.eggYalkAmountUnits;
		this.lemonJuiceAmountMl = builder.lemonJuiceAmountMl;
		this.fruitJuiceAmountMl = builder.fruitJuiceAmountMl;
		this.whiskeyAmountMl = builder.whiskeyAmountMl;
		this.amarettoAmountMl = builder.amarettoAmountMl;
		this.mapleSyrupAmountMl = builder.mapleSyrupAmountMl;
		this.chocolateSyrupAmountMl = builder.chocolateSyrupAmountMl;
		this.marshmallowsAmountGr = builder.marshmallowsAmountGr;
	}
			
	public Scanner getScanner() {
		return scanner;
	}
	
	public CaffeeBeans getCaffeeBeans() {
		return caffeeBeans;
	}

	public int getCaffeeBeansARABICAAmountGr() {
		return caffeeBeansARABICAAmountGr;
	}

	public int getCaffeeBeansROBUSTAAmountGr() {
		return caffeeBeansROBUSTAAmountGr;
	}

	public int getWaterAmountMl() {
		return waterAmountMl;
	}

	public int getSugarAmountGr() {
		return sugarAmountGr;
	}

	public int getMilkAmountMl() {
		return milkAmountMl;
	}

	public int getSaltAmountGr() {
		return saltAmountGr;
	}

	public int getCardamonAmountGr() {
		return cardamonAmountGr;
	}

	public int getCinnamonAmountGr() {
		return cinnamonAmountGr;
	}

	public int getButterAmountGr() {
		return butterAmountGr;
	}

	public int getNutmegAmountGr() {
		return nutmegAmountGr;
	}

	public int getCayennePepperAmountGr() {
		return cayennePepperAmountGr;
	}

	public int getGingerAmountGr() {
		return gingerAmountGr;
	}

	public int getCocoaPowderAmountGr() {
		return cocoaPowderAmountGr;
	}

	public int getIceCreamAmountGr() {
		return iceCreamAmountGr;
	}

	public int getCreamAmountGr() {
		return creamAmountGr;
	}

	public int getIceAmountGr() {
		return iceAmountGr;
	}

	public int getDarkChocolateAmountGr() {
		return darkChocolateAmountGr;
	}

	public int getHoneyAmountGr() {
		return honeyAmountGr;
	}

	public int getStarAnisAmountGr() {
		return starAnisAmountGr;
	}

	public int getClovesAmountGr() {
		return clovesAmountGr;
	}

	public int getPeppermintOilAmountMl() {
		return peppermintOilAmountMl;
	}

	public int getCoconutOilAmountMl() {
		return coconutOilAmountMl;
	}

	public int getLavenderOilAmountMl() {
		return lavenderOilAmountMl;
	}

	public int getHazelnutOilAmountMl() {
		return hazelnutOilAmountMl;
	}

	public int getCoconutWaterAmountMl() {
		return coconutWaterAmountMl;
	}

	public int getCoconutMilkAmountMl() {
		return coconutMilkAmountMl;
	}

	public int getEggYalkAmountUnits() {
		return eggYalkAmountUnits;
	}

	public int getLemonJuiceAmountMl() {
		return lemonJuiceAmountMl;
	}

	public int getFruitJuiceAmountMl() {
		return fruitJuiceAmountMl;
	}

	public int getWhiskeyAmountMl() {
		return whiskeyAmountMl;
	}

	public int getAmarettoAmountMl() {
		return amarettoAmountMl;
	}

	public int getMapleSyrupAmountMl() {
		return mapleSyrupAmountMl;
	}
	
	public int getChocolateSyrupAmountMl() {
		return chocolateSyrupAmountMl;
	}

	public int getMarshmallowsAmountGr() {
		return marshmallowsAmountGr;
	}
	
	public static class CaffeeMakerBuilder {
		
	
		private Scanner scanner;
		private CaffeeBeans caffeeBeans;
		private int caffeeBeansARABICAAmountGr;
		private int caffeeBeansROBUSTAAmountGr;
		private int waterAmountMl;
		private int sugarAmountGr;
		private int milkAmountMl;
		
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
	
	
		public CaffeeMakerBuilder(CaffeeBeans caffeeBeans, int caffeeBeansARABICAAmountGr, 
				int caffeeBeansROBUSTAAmountGr, int waterAmountMl) {
			this.scanner = new Scanner(System.in);
			System.out.println("Please, enter the CaffeeBeans type you would prefer to use bellow [ARABICA/ROBUSTA]: ");
			String beans = this.scanner.next();
			this.caffeeBeans = CaffeeBeans.valueOf(beans);
			if (this.caffeeBeans.equals(CaffeeBeans.ARABICA)) {
				this.caffeeBeansARABICAAmountGr = caffeeBeansARABICAAmountGr;
				this.caffeeBeansROBUSTAAmountGr = 0;
			} else if (this.caffeeBeans.equals(CaffeeBeans.ROBUSTA)) {
				this.caffeeBeansARABICAAmountGr = 0;
				this.caffeeBeansROBUSTAAmountGr = caffeeBeansROBUSTAAmountGr;
			} else {
				this.caffeeBeansARABICAAmountGr = caffeeBeansARABICAAmountGr;
				this.caffeeBeansROBUSTAAmountGr = caffeeBeansROBUSTAAmountGr;
			}
			this.waterAmountMl = waterAmountMl;
			System.out.println("Please, enter the the Sugar Quantity in grams you would prefer to use bellow: ");
			int sugarAmountGr = this.scanner.nextInt();
			this.sugarAmountGr = sugarAmountGr;
			System.out.println("Please, enter the the Milk Quantity in milliliters you would prefer to use bellow: ");
			int milkAmountMl = this.scanner.nextInt();
			this.milkAmountMl = milkAmountMl;
		}
	
		public CaffeeMakerBuilder setSaltAmountGr(int saltAmountGr) {
			this.saltAmountGr = saltAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setCardamonAmountGr(int cardamonAmountGr) {
			this.cardamonAmountGr = cardamonAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setCinnamonAmountGr(int cinnamonAmountGr) {
			this.cinnamonAmountGr = cinnamonAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setButterAmountGr(int butterAmountGr) {
			this.butterAmountGr = butterAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setNutmegAmountGr(int nutmegAmountGr) {
			this.nutmegAmountGr = nutmegAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setCayennePepperAmountGr(int cayennePepperAmountGr) {
			this.cayennePepperAmountGr = cayennePepperAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setGingerAmountGr(int gingerAmountGr) {
			this.gingerAmountGr = gingerAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setCocoaPowderAmountGr(int cocoaPowderAmountGr) {
			this.cocoaPowderAmountGr = cocoaPowderAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setIceCreamAmountGr(int iceCreamAmountGr) {
			this.iceCreamAmountGr = iceCreamAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setCreamAmountGr(int creamAmountGr) {
			this.creamAmountGr = creamAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setIceAmountGr(int iceAmountGr) {
			this.iceAmountGr = iceAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setDarkChocolateAmountGr(int darkChocolateAmountGr) {
			this.darkChocolateAmountGr = darkChocolateAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setHoneyAmountGr(int honeyAmountGr) {
			this.honeyAmountGr = honeyAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setStarAnisAmountGr(int starAnisAmountGr) {
			this.starAnisAmountGr = starAnisAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setClovesAmountGr(int clovesAmountGr) {
			this.clovesAmountGr = clovesAmountGr;
			return this;
		}
	
		public CaffeeMakerBuilder setPeppermintOilAmountMl(int peppermintOilAmountMl) {
			this.peppermintOilAmountMl = peppermintOilAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setCoconutOilAmountMl(int coconutOilAmountMl) {
			this.coconutOilAmountMl = coconutOilAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setLavenderOilAmountMl(int lavenderOilAmountMl) {
			this.lavenderOilAmountMl = lavenderOilAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setHazelnutOilAmountMl(int hazelnutOilAmountMl) {
			this.hazelnutOilAmountMl = hazelnutOilAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setCoconutWaterAmountMl(int coconutWaterAmountMl) {
			this.coconutWaterAmountMl = coconutWaterAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setCoconutMilkAmountMl(int coconutMilkAmountMl) {
			this.coconutMilkAmountMl = coconutMilkAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setEggYalkAmountUnits(int eggYalkAmountUnits) {
			this.eggYalkAmountUnits = eggYalkAmountUnits;
			return this;
		}
	
		public CaffeeMakerBuilder setLemonJuiceAmountMl(int lemonJuiceAmountMl) {
			this.lemonJuiceAmountMl = lemonJuiceAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setFruitJuiceAmountMl(int fruitJuiceAmountMl) {
			this.fruitJuiceAmountMl = fruitJuiceAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setWhiskeyAmountMl(int whiskeyAmountMl) {
			this.whiskeyAmountMl = whiskeyAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setAmarettoAmountMl(int amarettoAmountMl) {
			this.amarettoAmountMl = amarettoAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setMapleSyrupAmountMl(int mapleSyrupAmountMl) {
			this.mapleSyrupAmountMl = mapleSyrupAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setChocolateSyrupAmountMl(int chocolateSyrupAmountMl) {
			this.chocolateSyrupAmountMl = chocolateSyrupAmountMl;
			return this;
		}
	
		public CaffeeMakerBuilder setMarshmallowsAmountGr(int marshmallowsAmountGr) {
			this.marshmallowsAmountGr = marshmallowsAmountGr;
			return this;
		}
		
		public CaffeeMaker build() {
			return new CaffeeMaker(this);
		}
	
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaffeeMaker [");
		/*if (scanner != null) {
			builder.append("scanner=");
			builder.append(scanner);
			builder.append(", ");
		}*/
		if (caffeeBeans != null) {
			builder.append("caffeeBeans=");
			builder.append(caffeeBeans);
			builder.append(", ");
		}
		if (caffeeBeansARABICAAmountGr != 0) {
			builder.append(", caffeeBeansARABICAAmountGr=");
			builder.append(caffeeBeansARABICAAmountGr);
		}
		if (caffeeBeansROBUSTAAmountGr != 0) {
			builder.append(", caffeeBeansROBUSTAAmountGr=");
			builder.append(caffeeBeansROBUSTAAmountGr);
		}
		builder.append(", waterAmountMl=");
		builder.append(waterAmountMl);
		if (sugarAmountGr != 0) {
			builder.append(", sugarAmountGr=");
			builder.append(sugarAmountGr);
		}
		if (milkAmountMl != 0) {
			builder.append(", milkAmountMl=");
			builder.append(milkAmountMl);
		}
		if (saltAmountGr != 0) {
			builder.append(", saltAmountGr=");
			builder.append(saltAmountGr);
		}
		if (cardamonAmountGr != 0) {
			builder.append(", cardamonAmountGr=");
			builder.append(cardamonAmountGr);
		}
		if (cinnamonAmountGr != 0) {
			builder.append(", cinnamonAmountGr=");
			builder.append(cinnamonAmountGr);
		}
		if (butterAmountGr != 0) {
			builder.append(", butterAmountGr=");
			builder.append(butterAmountGr);
		}
		if (nutmegAmountGr != 0) {
			builder.append(", nutmegAmountGr=");
			builder.append(nutmegAmountGr);
		}
		if (cayennePepperAmountGr != 0) {
			builder.append(", cayennePepperAmountGr=");
			builder.append(cayennePepperAmountGr);
		}
		if (gingerAmountGr != 0) {
			builder.append(", gingerAmountGr=");
			builder.append(gingerAmountGr);
		}
		if (cocoaPowderAmountGr != 0) {
			builder.append(", cocoaPowderAmountGr=");
			builder.append(cocoaPowderAmountGr);
		}
		if (iceCreamAmountGr != 0) {
			builder.append(", iceCreamAmountGr=");
			builder.append(iceCreamAmountGr);
		}
		if (creamAmountGr != 0) {
			builder.append(", creamAmountGr=");
			builder.append(creamAmountGr);
		}
		if (iceAmountGr != 0) {
			builder.append(", iceAmountGr=");
			builder.append(iceAmountGr);
		}
		if (darkChocolateAmountGr != 0) {
			builder.append(", darkChocolateAmountGr=");
			builder.append(darkChocolateAmountGr);
		}
		if (honeyAmountGr != 0) {
			builder.append(", honeyAmountGr=");
			builder.append(honeyAmountGr);
		}
		if (starAnisAmountGr != 0) {
			builder.append(", starAnisAmountGr=");
			builder.append(starAnisAmountGr);
		}
		if (clovesAmountGr != 0) {
			builder.append(", clovesAmountGr=");
			builder.append(clovesAmountGr);
		}
		if (peppermintOilAmountMl != 0) {
			builder.append(", peppermintOilAmountMl=");
			builder.append(peppermintOilAmountMl);
		}
		if (coconutOilAmountMl != 0) {
			builder.append(", coconutOilAmountMl=");
			builder.append(coconutOilAmountMl);
		}
		if (lavenderOilAmountMl != 0) {
			builder.append(", lavenderOilAmountMl=");
			builder.append(lavenderOilAmountMl);
		}
		if (hazelnutOilAmountMl != 0) {
			builder.append(", hazelnutOilAmountMl=");
			builder.append(hazelnutOilAmountMl);
		}
		if (coconutWaterAmountMl != 0) {
			builder.append(", coconutWaterAmountMl=");
			builder.append(coconutWaterAmountMl);
		}
		if (coconutMilkAmountMl != 0) {
			builder.append(", coconutMilkAmountMl=");
			builder.append(coconutMilkAmountMl);
		}
		if (eggYalkAmountUnits != 0) {
			builder.append(", eggYalkAmountUnits=");
			builder.append(eggYalkAmountUnits);
		}
		if (lemonJuiceAmountMl != 0) {
			builder.append(", lemonJuiceAmountMl=");
			builder.append(lemonJuiceAmountMl);
		}
		if (fruitJuiceAmountMl != 0) {
			builder.append(", fruitJuiceAmountMl=");
			builder.append(fruitJuiceAmountMl);
		}
		if (whiskeyAmountMl != 0) {
			builder.append(", whiskeyAmountMl=");
			builder.append(whiskeyAmountMl);
		}
		if (amarettoAmountMl != 0) {
			builder.append(", amarettoAmountMl=");
			builder.append(amarettoAmountMl);
		}
		if (mapleSyrupAmountMl != 0) {
			builder.append(", mapleSyrupAmountMl=");
			builder.append(mapleSyrupAmountMl);
		}
		if (chocolateSyrupAmountMl != 0) {
			builder.append(", chocolateSyrupAmountMl=");
			builder.append(chocolateSyrupAmountMl);
		}
		if (marshmallowsAmountGr != 0) {
			builder.append(", marshmallowsAmountGr=");
			builder.append(marshmallowsAmountGr);
		}
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		CaffeeMaker caffeeMaker = new CaffeeMaker.CaffeeMakerBuilder(CaffeeBeans.ROBUSTA, 0, 30, 70)
				.setCayennePepperAmountGr(3)
				.setCardamonAmountGr(5)
				.setCocoaPowderAmountGr(20)
				.setCoconutOilAmountMl(2)
				.build();
		CaffeeMaker caffeeMakerNew = new CaffeeMaker.CaffeeMakerBuilder(CaffeeBeans.ARABICA, 35, 30, 75)
				.setButterAmountGr(2)
				.setChocolateSyrupAmountMl(5)
				.setDarkChocolateAmountGr(10)
				.setAmarettoAmountMl(30)
				.build();
		System.out.println(caffeeMaker);
		System.out.println(caffeeMakerNew);

	}

	

}
