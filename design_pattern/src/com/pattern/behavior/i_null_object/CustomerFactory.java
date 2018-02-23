package com.pattern.behavior.i_null_object;

/**
 * 客户工厂
 * @author xhk
 * @date 2018年2月23日
 */
public class CustomerFactory {

	private static String[] names = {"jerry","jack","tom"};
	
	public static AbstractCustomer getCustomer(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
