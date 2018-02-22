package com.pattern.create.c_singleton;

/**
 * 双检索/双重校验锁（double-checked-locking）
 * @author xhk
 * @date 2018年2月22日
 */
public class DCLSingleton {

	private DCLSingleton () {}
	
	private static DCLSingleton instance;
	
	private static DCLSingleton getInstance(){
		
		if(instance == null){
			synchronized(DCLSingleton.class){
				if(instance == null){
					instance = new DCLSingleton();
				}
			}
		}
		
		return instance;
	}
}
