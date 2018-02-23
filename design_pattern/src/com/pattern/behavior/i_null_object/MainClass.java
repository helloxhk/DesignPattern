package com.pattern.behavior.i_null_object;

/**
 * 空对象模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		AbstractCustomer tom = CustomerFactory.getCustomer("tom");
		AbstractCustomer a = CustomerFactory.getCustomer("a");
		AbstractCustomer jack = CustomerFactory.getCustomer("jack");
		AbstractCustomer b = CustomerFactory.getCustomer("b");
		
		System.out.println(tom.getName());
		System.out.println(a.getName());
		System.out.println(jack.getName());
		System.out.println(b.getName());
	}

}
