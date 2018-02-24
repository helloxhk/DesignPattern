package com.pattern.create.e_prototype;

/**
 * 圆形
 * @author xhk
 * @date 2018年2月22日
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Circle : draw() method");
	}

}
