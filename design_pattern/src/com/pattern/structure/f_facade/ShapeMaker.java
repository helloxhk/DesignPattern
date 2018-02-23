package com.pattern.structure.f_facade;

/**
 * 外观类
 * 
 * @author xhk
 * @date 2018年2月23日
 */
public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
