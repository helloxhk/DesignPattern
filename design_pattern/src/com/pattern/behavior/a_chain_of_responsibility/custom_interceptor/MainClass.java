package com.pattern.behavior.a_chain_of_responsibility.custom_interceptor;

/**
 * 自定义拦截器
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		Invocation invocation = new Invocation();
		invocation.addInterceptor(new FirstInterceptor());
		invocation.addInterceptor(new SecondInterceptor());
		invocation.invoke();
	}

}
