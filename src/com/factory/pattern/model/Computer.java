package com.factory.pattern.model;

public abstract class Computer {
	
	public abstract String getName();
	public abstract int getRamGb();
	public abstract int getHddGb();
	public abstract double getCpuGHz();
	public abstract String getGraphicCard();
	public abstract String getMotherBoard();
	
	@Override
	public String toString() {
		return "ComputerConfiguration {name = " + this.getName()
				+ ", RAM = " + this.getRamGb() + " Gb, HDD = " 
				+ this.getHddGb() + " Gb, CPU = " + this.getCpuGHz()
				+ " GHz, GraphicCard = " + this.getGraphicCard()
				+ ", MotherBoard = " + this.getMotherBoard() + "}";
	}
}
