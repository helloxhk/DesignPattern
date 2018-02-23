package com.pattern.structure.e_decorator;

/**
 * 抽象装饰类
 * @author xhk
 * @date 2018年2月23日
 */
public class ShapeDecorator implements Shape {

	protected Shape shapeDecorator;
	
	public ShapeDecorator(Shape shapeDecorator) {
		this.shapeDecorator = shapeDecorator;
	}
	
	@Override
	public void draw() {
		shapeDecorator.draw();
	}

}
