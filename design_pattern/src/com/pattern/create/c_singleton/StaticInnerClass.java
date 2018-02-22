package com.pattern.create.c_singleton;

public class StaticInnerClass {
	/**
	 * 静态内部类只有在被调用的时候才加载
	 */
	private static class SingleStatic {
		private static final StaticInnerClass INSTANCE = new StaticInnerClass();
	}
	
	private StaticInnerClass(){}
	
	private StaticInnerClass getInstance(){
		return SingleStatic.INSTANCE;
	}
	
}
