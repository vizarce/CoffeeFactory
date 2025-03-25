package com.factory.pattern.model;

public class GamingPC extends Computer {
	
	private String name;
	private int ramGb;
	private int hddGb;
	private double cpuGHz;
	private String graphicCard;
	private String motherBoard;
	
	public GamingPC(String name, int ramGb, 
			int hddGb, double cpuGHz, 
			String graphicCard, String motherBoard) {
		super();
		this.name = name;
		this.ramGb = ramGb;
		this.hddGb = hddGb;
		this.cpuGHz = cpuGHz;
		this.graphicCard = graphicCard;
		this.motherBoard = motherBoard;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getRamGb() {
		return this.ramGb;
	}

	@Override
	public int getHddGb() {
		return this.hddGb;
	}

	@Override
	public double getCpuGHz() {
		return this.cpuGHz;
	}

	@Override
	public String getGraphicCard() {
		return this.graphicCard;
	}

	@Override
	public String getMotherBoard() {
		return this.motherBoard;
	}
}
