package com.pattern.create.d_builder;

/**
 * 食物条目
 * @author xhk
 * @date 2018年2月22日
 */
public interface Item {
	
	String name();
	
	Packing packing();
	
	float price();
	
}
