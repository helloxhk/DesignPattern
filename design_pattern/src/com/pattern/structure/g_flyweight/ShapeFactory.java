package com.pattern.structure.g_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂
 * @author xhk
 * @date 2018年2月23日
 */
public class ShapeFactory {
	
	private static Map<String, Shape> circleMap = new HashMap<>();
	
	public static Circle getCircle(String color){
		Circle circle = (Circle) circleMap.get(color);
		if(circle == null){
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("creating circle of color : " + color);
		}
		return circle;
	}
	
}
