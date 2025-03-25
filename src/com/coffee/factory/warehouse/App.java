package com.coffee.factory.warehouse;

import java.util.Arrays;

public class App {


	public static void main(String[] args) {
		CaffeeBeans cb = CaffeeBeans.ARABICA;
		System.out.println(cb.name());
		System.out.println(cb.ordinal());
		System.out.println(cb.toString());
		//System.out.println(CaffeeBeans.valueOf("Arabica"));
		System.out.println(cb.getBeansType());
		System.out.println(cb.getDeclaringClass().getName());
		System.out.println(cb.describeConstable().get());
		System.out.println(cb.describeConstable().orElseThrow());
		System.out.println(Arrays.toString(CaffeeBeans.values()));
		double one = 1.55;
		Integer two = 2;
		System.out.println(two.getClass().getCanonicalName().equalsIgnoreCase("java.lang.Integer"));
		System.out.println(CaffeeBeans.valueOf("ARABICA"));

	}

}
