package com.pattern.create.d_builder;

/**
 * 测试
 * @author xhk
 * @date 2018年2月22日
 */
public class MainClass {

	public static void main(String[] args) {
		
		MealBuilder builder = new MealBuilder();
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println(vegMeal.getCost());
		vegMeal.showItems();
		
		Meal chickenMeal = builder.prepareChickenMeal();
		System.out.println(chickenMeal.getCost());
		chickenMeal.showItems();
		
	}

}
