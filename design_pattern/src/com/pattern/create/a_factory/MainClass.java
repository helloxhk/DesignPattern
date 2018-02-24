package com.pattern.create.a_factory;

/**
 * 工厂模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		
		/**
		 * 1.普通工厂
		 */
		ShapeFactory factory = new ShapeFactory();
		Circle circle = (Circle) factory.getShape("circle");
		circle.draw();
		
		/**
		 * 2.
		 */
		ShapeFactory2 factory2 = new ShapeFactory2();
		Rectangle rectangle = factory2.getShape(Rectangle.class);
		rectangle.draw();
		
		/**
		 * 3.静态工厂
		 */
		Square square = ShapeFactory3.getShape(Square.class);
		square.draw();
	}

}
