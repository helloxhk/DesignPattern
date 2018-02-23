package com.pattern.behavior.a_chain_of_responsibility.custom_interceptor;

/**
 * 拦截器1
 * @author xhk
 * @date 2018年2月23日
 */
public class FirstInterceptor implements Interceptor {

	@Override
	public void intercept(Invocation invocation) {
		System.out.println("拦截器1 执行前");
		invocation.invoke();
		System.out.println("拦截器1 执行后");
	}

}
