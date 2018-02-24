package com.pattern.create.e_prototype;

/**
 * 矩形
 * @author xhk
 * @date 2018年2月22日
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Rectangle : draw() method");
	}

}
