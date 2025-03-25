package com.coffee.factory.warehouse;

public enum CaffeeBeans {
	ARABICA("Arabica"),
	ROBUSTA("Robusta");
	
	private final String beansType;

	private CaffeeBeans(String beansType) {
		this.beansType = beansType;
	}

	public String getBeansType() {
		return beansType;
	}
	
	

}
