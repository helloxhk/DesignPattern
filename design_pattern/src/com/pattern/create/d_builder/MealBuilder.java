package com.pattern.create.d_builder;

public class MealBuilder {

	/**
	 * 蔬菜汉堡套餐
	 * @return
	 */
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	/**
	 * 肌肉汉堡套餐
	 * @return
	 */
	public Meal prepareChickenMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
}
