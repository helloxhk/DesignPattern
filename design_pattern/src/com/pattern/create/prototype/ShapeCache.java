package com.pattern.create.prototype;

import java.util.HashMap;

/**
 * 缓存
 * @author xhk
 * @date 2018年2月22日
 */
public class ShapeCache {
	
	private static HashMap<String, Shape> cache = new HashMap<>();

	public static Shape getShape(String shapeId) {
		Shape shape = cache.get(shapeId);
		return (Shape) shape.clone();
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		cache.put("1", circle);
		
		Square square = new Square();
		square.setId("2");
		cache.put("2", square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		cache.put("3", rectangle);
	}
}
