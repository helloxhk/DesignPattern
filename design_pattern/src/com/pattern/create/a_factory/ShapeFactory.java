package com.pattern.create.a_factory;

/**
 * 图形工厂1
 * 		缺点：每次增加一个新的类，都需要修改工厂代码。
 * @author xhk
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType){
		shapeType = shapeType.trim();
		if(shapeType == null){
			return null;
		}
		
		// 硬编码
		if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("square")){
			return new Square();
		} else if (shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		
		return null;
	}
}
