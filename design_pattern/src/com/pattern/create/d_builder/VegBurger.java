package com.pattern.create.d_builder;

/**
 * 蔬菜汉堡
 * @author xhk
 * @date 2018年2月22日
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 25.0F;
	}

}
