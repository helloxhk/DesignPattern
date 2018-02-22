package com.pattern.create.d_builder;

/**
 * 可口可乐
 * @author xhk
 * @date 2018年2月22日
 */
public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 8.0F;
	}

}
