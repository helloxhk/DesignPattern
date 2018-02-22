package com.pattern.create.a_factory;

/**
 * 图形工厂3
 * 		静态工厂。
 * @author xhk
 */
public class ShapeFactory3 {
	
	public static <T> T getShape(Class<? extends T> clazz){
		
		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	
		return null;
	}
}
