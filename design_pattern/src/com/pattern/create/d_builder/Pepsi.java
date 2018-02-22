package com.pattern.create.d_builder;

/**
 * 百事可乐
 * @author xhk
 * @date 2018年2月22日
 */
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 9.0F;
	}

}
