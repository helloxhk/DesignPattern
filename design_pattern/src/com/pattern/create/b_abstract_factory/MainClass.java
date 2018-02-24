package com.pattern.create.b_abstract_factory;

/**
<<<<<<< HEAD
 * 抽象工厂模式
=======
 * test
>>>>>>> refs/remotes/origin/master
 * @author xhk
 * @date 2018年2月22日
 */
public class MainClass {
	
	public static void main(String[] args) {
		/**
		 * 颜色工厂
		 */
		ColorFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
		Red red = colorFactory.get(Red.class);
		red.fill();
		
		/**
		 * 图形工厂
		 */
		ShapeFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
		Circle circle = shapeFactory.get(Circle.class);
		circle.draw();
	}
}
