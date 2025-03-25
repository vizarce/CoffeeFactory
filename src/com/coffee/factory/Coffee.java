package com.coffee.factory;

import com.coffee.factory.processing.CoffeeGrinder;
import com.coffee.factory.processing.CoffeeIntention;
import com.coffee.factory.processing.CoffeeOrder;
import com.coffee.factory.processing.CoffeeProcessingStage;
import com.coffee.factory.processing.CoffeeRobustness;

public class Coffee extends CommonCoffee {
	
	private CoffeeType coffeeType;
	private CoffeeRobustness coffeeRobustness;
	private int amountGr;
	private boolean wanted;
	private boolean ordered;
	private boolean grinded;
	private boolean made;
	private boolean poured;
	private CoffeeProcessingStage coffeeProcessingStage;
	private CoffeeGrinder coffeeGrinder;
	
    public Coffee() {}
    
	public Coffee(CoffeeType coffeeType, CoffeeRobustness coffeeRobustness, int amountGr, 
			boolean wanted, boolean ordered, boolean grinded, boolean made, boolean poured,
			CoffeeProcessingStage coffeeProcessingStage) {
		this.coffeeType = coffeeType;
		this.coffeeRobustness = coffeeRobustness;
		this.amountGr = amountGr;
		this.wanted = wanted;
		this.ordered = ordered;
		this.grinded = grinded;
		this.made = made;
		this.poured = poured;
		this.coffeeProcessingStage = this.getCoffeeProcessingStage();
		this.coffeeGrinder = getCoffeeGrinder();
	}

	public CoffeeType getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}

	public CoffeeRobustness getCoffeeRobustness() {
		return coffeeRobustness;
	}

	public void setCoffeeRobustness(CoffeeRobustness coffeeRobustness) {
		this.coffeeRobustness = coffeeRobustness;
	}

	public int getAmountGr() {
		return amountGr;
	}

	public void setAmountGr(int amountGr) {
		this.amountGr = amountGr;
	}

	public boolean isWanted() {
		return wanted;
	}

	public void setWanted(boolean wanted) {
		this.wanted = wanted;
	}
	
	public boolean isOrdered() {
		return ordered;
	}

	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
	}

	public boolean isGrinded() {
		return grinded;
	}

	public void setGrinded(boolean grinded) {
		this.grinded = grinded;
	}

	public boolean isMade() {
		return made;
	}

	public void setMade(boolean made) {
		this.made = made;
	}

	public boolean isPoured() {
		return poured;
	}

	public void setPoured(boolean poured) {
		this.poured = poured;
	}

	@Override
	public CoffeeGrinder getCoffeeGrinder() {
		//this.coffeeGrinder = new CoffeeGrinder(this);
		return coffeeGrinder;
	}

	public void setCoffeeGrinder(CoffeeGrinder coffeeGrinder) {
		this.coffeeGrinder = coffeeGrinder;
	}

	public void setCoffeeProcessingStage(CoffeeProcessingStage coffeeProcessingStage) {
		this.coffeeProcessingStage = coffeeProcessingStage;
	}

	public CoffeeProcessingStage getCoffeeProcessingStage() {
		if (this.wanted == true && this.ordered == true && this.grinded == true && this.made == true && this.poured == true)
			this.coffeeProcessingStage = CoffeeProcessingStage.POURED;
		else if (this.wanted == true && this.ordered == true && this.grinded == true && this.made == true)
			this.coffeeProcessingStage = CoffeeProcessingStage.MADE;
		else if (this.wanted == true && this.ordered == true && this.grinded == true)
			this.coffeeProcessingStage = CoffeeProcessingStage.GRINDED;
		else if (this.wanted == true && this.ordered == true)
			this.coffeeProcessingStage = CoffeeProcessingStage.ORDERED;
		else if (this.wanted == true)
			this.coffeeProcessingStage = CoffeeProcessingStage.WANTED;
		else
			this.coffeeProcessingStage = null;
		return coffeeProcessingStage;
	}

	@Override
	public void orderCoffee() {
		CoffeeIntention intention = new CoffeeIntention(this.getCoffeeType(), this.getCoffeeRobustness());
		System.out.println("Coffee Intention:::" + intention);
		intention.make();
		System.out.println("Coffee Intention:::" + intention);
		if (intention.getCoffeeProcessingStage().equals(CoffeeProcessingStage.WANTED)) {
			CoffeeOrder coffeeOrder = new CoffeeOrder(this);
			coffeeOrder.makeOrder();
			System.out.println("Your CoffeeOrder:::" + coffeeOrder);
		} else {
			System.out.println("You have already odered Coffee or simply do not want it!");
		}
		
	}
	
	@Override
	public void grindCoffee() {
		this.coffeeGrinder = new CoffeeGrinder(this);
		Coffee grindedCoffee = this.coffeeGrinder.grind();
		System.out.println("Grinded Actual Coffee in the Method:::" + grindedCoffee);
    }
	
	@Override
    public void makeCoffee() {
        // делаем кофе
		System.out.println("Your Coffee is already made!");
    }
	
	@Override
    public void pourIntoCup() {
        // наливаем в чашку
		System.out.println("Your Coffee is already poured into the proper Cup!");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (coffeeProcessingStage == CoffeeProcessingStage.WANTED)
			builder.append("Wanted");
		if (coffeeProcessingStage == CoffeeProcessingStage.ORDERED)
			builder.append("Ordered");
		if (coffeeProcessingStage == CoffeeProcessingStage.GRINDED)// && grinded == true && made == false && poured == false)
			builder.append("Grinded");
		if (coffeeProcessingStage == CoffeeProcessingStage.MADE)
			builder.append("Made");
		if (coffeeProcessingStage == CoffeeProcessingStage.POURED)
			builder.append("Poured");
		builder.append("Coffee{");
		if (coffeeType != null) {
			builder.append("coffeeType = ");
			builder.append(coffeeType);
			builder.append(", ");
		}
		if (coffeeRobustness != null) {
			builder.append("coffeeRobustness = ");
			builder.append(coffeeRobustness);
			builder.append(", ");
		}
		builder.append("amountGr = ");
		builder.append(amountGr);
		builder.append(", wanted = ");
		builder.append(wanted);
		builder.append(", ordered = ");
		builder.append(ordered);
		builder.append(", grinded = ");
		builder.append(grinded);
		builder.append(", made = ");
		builder.append(made);
		builder.append(", poured = ");
		builder.append(poured);
		builder.append(", ");
		if (coffeeProcessingStage != null) {
			builder.append("coffeeProcessingStage = ");
			builder.append(coffeeProcessingStage);
			//builder.append(", ");
		}
		/*if (coffeeGrinder != null) {
			builder.append("coffeeGrinder = ");
			builder.append(new CoffeeGrinder(this));
		}*/
		builder.append("}");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		Coffee coffeeNew = new Coffee(CoffeeType.CAFFE_LATTE, CoffeeRobustness.MIDDLE, 150, true, false, false, false, false, CoffeeProcessingStage.WANTED);
		System.out.println("Actual Coffee Wanted:::" + coffeeNew);
		coffeeNew.orderCoffee();
		coffeeNew.grindCoffee();
		System.out.println("Actual Grinded Coffee Wanted:::" + coffeeNew);
		
		Coffee coffeeNew01 = new Coffee(CoffeeType.CAPPUCCINO, CoffeeRobustness.LIGHT, 100, true, true, false, false, false, CoffeeProcessingStage.ORDERED);
		System.out.println("Actual Coffee Ordered:::" + coffeeNew01);
		coffeeNew01.orderCoffee();
		coffeeNew01.grindCoffee();
		System.out.println("Actual Grinded Coffee Ordered:::" + coffeeNew01);
		
		Coffee coffeeNew02 = new Coffee(CoffeeType.ESPRESSO, CoffeeRobustness.STRONG, 200, true, true, true, true, false, CoffeeProcessingStage.MADE);
		System.out.println("Actual Coffee Made:::" + coffeeNew02);
		coffeeNew02.orderCoffee();
		coffeeNew02.grindCoffee();
		System.out.println("Actual Grinded Coffee Made:::" + coffeeNew02);
		
		Coffee coffeeNew03 = new Coffee(CoffeeType.AMERICANO, CoffeeRobustness.ROBUST, 95, true, true, false, false, false, CoffeeProcessingStage.ORDERED);
		System.out.println("Actual Coffee Ordered-03:::" + coffeeNew03);
	}
}