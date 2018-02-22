package com.pattern.create.b_abstract_factory;

/**
 * 工厂生成器
 * @author xhk
 * @date 2018年2月22日
 */
public class FactoryProducer {
	
	public static <T> T getFactory(Class<? extends T> clazz){
		
		try {
			return clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
