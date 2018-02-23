package com.pattern.structure.e_decorator;

/**
 * 红边框装饰
 * @author xhk
 * @date 2018年2月23日
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
	}

	@Override
	public void draw() {
		shapeDecorator.draw();
		setRedBorder();
	}
	
	private void setRedBorder() {
		System.out.println("Border Color: Red");
	}
}
