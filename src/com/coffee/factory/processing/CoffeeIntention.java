package com.coffee.factory.processing;

import com.coffee.factory.CoffeeType;

public class CoffeeIntention implements Intention {

	private CoffeeType coffeeType;
	private CoffeeRobustness coffeeRobustness;
	private CoffeeProcessingStage coffeeProcessingStage;
	
	public CoffeeIntention() {}
	
	public CoffeeIntention(CoffeeType coffeeType, CoffeeRobustness coffeeRobustness) {
		this.coffeeType = coffeeType;
		this.coffeeRobustness = coffeeRobustness;
		this.coffeeProcessingStage = CoffeeProcessingStage.ZERO;
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

	public CoffeeProcessingStage getCoffeeProcessingStage() {
		return coffeeProcessingStage;
	}

	public void setCoffeeProcessingStage(CoffeeProcessingStage coffeeProcessingStage) {
		this.coffeeProcessingStage = coffeeProcessingStage;
	}

	@Override
	public CoffeeIntention make() {
		this.setCoffeeProcessingStage(CoffeeProcessingStage.WANTED);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoffeeIntention [for Coffee{");
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
		if (coffeeProcessingStage != null) {
			builder.append("coffeeProcessingStage = ");
			builder.append(coffeeProcessingStage);
		}
		builder.append("}]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		CoffeeIntention intention = new CoffeeIntention(CoffeeType.AMERICANO, CoffeeRobustness.MIDDLE);
		System.out.println(intention);
		intention.make();
		System.out.println(intention);
	}
	

}
