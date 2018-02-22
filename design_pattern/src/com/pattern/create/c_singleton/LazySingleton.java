package com.pattern.create.c_singleton;

/**
 * 懒汉式
 * 		线程不安全
 * @author xhk
 * @date 2018年2月22日
 */
public class LazySingleton {
	
	private LazySingleton() {}
	
	private static LazySingleton single = null;
	
	public static synchronized LazySingleton getSingle(){
		
		if(single == null){
			single = new LazySingleton();
		}
		
		return single;
	}
}
