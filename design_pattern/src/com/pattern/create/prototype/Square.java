package com.pattern.create.prototype;

/**
 * 正方形
 * @author xhk
 * @date 2018年2月22日
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println("Square : draw() method");
	}

}
