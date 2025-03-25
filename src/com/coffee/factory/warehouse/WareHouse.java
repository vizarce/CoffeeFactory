package com.coffee.factory.warehouse;

public interface WareHouse {
	
	public int takeIngredient(IngredientType ingredientType, String ingredient, Integer quantity);
	
	public void addIngredient(IngredientType ingredientType, String ingredient, Integer quantity);

}
