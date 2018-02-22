package com.pattern.create.b_abstract_factory;

/**
 * 抽象工厂
 * @author xhk
 */
public abstract class AbstractFactory {
	
	abstract <T> T get(Class<? extends T> clazz);
	
}
