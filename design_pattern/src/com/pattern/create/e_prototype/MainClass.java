package com.pattern.create.e_prototype;

/**
 * 原型模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape shape = ShapeCache.getShape("1");
		System.out.println(shape.getType());
		Shape shape2 = ShapeCache.getShape("2");
		System.out.println(shape2.getType());
		Shape shape3 = ShapeCache.getShape("3");
		System.out.println(shape3.getType());
	}
}
