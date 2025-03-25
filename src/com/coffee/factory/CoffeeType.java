package com.coffee.factory;

import java.math.BigDecimal;

public enum CoffeeType {
	CAFE_NOIR(BigDecimal.valueOf(13.99d)),
    ESPRESSO(BigDecimal.valueOf(15.99d)),
    DROPIO(BigDecimal.valueOf(21.99d)),
    RISTRETTO(BigDecimal.valueOf(16.99d)),
    MACCHIATO(BigDecimal.valueOf(17.99d)),
    CORTADO(BigDecimal.valueOf(17.99d)),
    RED_EYE(BigDecimal.valueOf(18.99d)),
    AFFOGATO(BigDecimal.valueOf(25.99d)),
    MOCHA(BigDecimal.valueOf(20.99d)),
    AMERICANO(BigDecimal.valueOf(13.99d)),
    CAFFE_LATTE(BigDecimal.valueOf(16.99d)),
    CAPPUCCINO(BigDecimal.valueOf(14.99d)),
    GALAO(BigDecimal.valueOf(16.99d)),
    IRISH(BigDecimal.valueOf(27.99d)),
    MOCACCINO(BigDecimal.valueOf(19.99d));
    
    private final BigDecimal price;
	
    CoffeeType(BigDecimal price) {
    	this.price = price;
    }

	public BigDecimal getPrice() {
		return price;
	}
    
    
}