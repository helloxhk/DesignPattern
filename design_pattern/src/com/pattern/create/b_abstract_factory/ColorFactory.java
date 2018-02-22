package com.pattern.create.b_abstract_factory;

/**
 * 颜色工厂
 * @author xhk
 */
public class ColorFactory extends AbstractFactory {

	@Override
	<T> T get(Class<? extends T> clazz) {
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
