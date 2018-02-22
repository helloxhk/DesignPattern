package com.pattern.create.a_factory;

/**
 * 图形工厂2
 * 		利用反射，解决每次新加产品都要修改工厂源码问题
 * @author xhk
 */
public class ShapeFactory2 {
	
	public <T> T getShape(Class<? extends T> clazz){
		
		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	
		return null;
	}
}
