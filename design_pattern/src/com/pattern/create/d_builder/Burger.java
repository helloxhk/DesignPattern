package com.pattern.create.d_builder;

/**
 * 汉堡
 * @author xhk
 * @date 2018年2月22日
 */
public abstract class Burger implements Item {
	
	/**
	 * 纸包装
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
}
