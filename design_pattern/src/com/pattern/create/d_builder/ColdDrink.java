package com.pattern.create.d_builder;

/**
 * 冷饮
 * @author xhk
 * @date 2018年2月22日
 */
public abstract class ColdDrink implements Item {

	/**
	 * 杯装
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
