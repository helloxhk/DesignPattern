package com.pattern.create.c_singleton;

/**
 * 饿汉式
 * 		线程安全
 * @author xhk
 * @date 2018年2月22日
 */
public class Singleton {
	
	private Singleton(){}
	
	private static Singleton single = new Singleton();
	
	public static Singleton getSingle(){
		return single;
	}
	
}
