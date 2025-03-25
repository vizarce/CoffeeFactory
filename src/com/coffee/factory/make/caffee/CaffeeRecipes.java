package com.coffee.factory.make.caffee;

public class CaffeeRecipes {
	
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
	
	public static class CafeNoirType {
		private int caffeeBeansARABICAAmountGr;
		private int caffeeBeansROBUSTAAmountGr;
		private int waterAmountMl;
		private int sugarAmountGr;
		
		public CafeNoirType() {
			this.caffeeBeansARABICAAmountGr = 0;
			this.caffeeBeansROBUSTAAmountGr = 30;
			this.waterAmountMl = 70;
			this.sugarAmountGr = 15;
		}
		
		public CafeNoirType(int caffeeBeansARABICAAmountGr, int caffeeBeansROBUSTAAmountGr, int waterAmountMl,
				int sugarAmountGr) {
			this.caffeeBeansARABICAAmountGr = caffeeBeansARABICAAmountGr;
			this.caffeeBeansROBUSTAAmountGr = caffeeBeansROBUSTAAmountGr;
			this.waterAmountMl = waterAmountMl;
			this.sugarAmountGr = sugarAmountGr;
		}

		public int getCaffeeBeansARABICAAmountGr() {
			return caffeeBeansARABICAAmountGr;
		}

		public void setCaffeeBeansARABICAAmountGr(int caffeeBeansARABICAAmountGr) {
			this.caffeeBeansARABICAAmountGr = caffeeBeansARABICAAmountGr;
		}

		public int getCaffeeBeansROBUSTAAmountGr() {
			return caffeeBeansROBUSTAAmountGr;
		}

		public void setCaffeeBeansROBUSTAAmountGr(int caffeeBeansROBUSTAAmountGr) {
			this.caffeeBeansROBUSTAAmountGr = caffeeBeansROBUSTAAmountGr;
		}

		public int getWaterAmountMl() {
			return waterAmountMl;
		}

		public void setWaterAmountMl(int waterAmountMl) {
			this.waterAmountMl = waterAmountMl;
		}

		public int getSugarAmountGr() {
			return sugarAmountGr;
		}

		public void setSugarAmountGr(int sugarAmountGr) {
			this.sugarAmountGr = sugarAmountGr;
		}
		
		
		
		
	}

}
