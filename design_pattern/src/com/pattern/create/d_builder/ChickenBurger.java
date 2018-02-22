package com.pattern.create.d_builder;

/**
 * 肌肉汉堡
 * @author xhk
 * @date 2018年2月22日
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 50.0F;
	}

}
