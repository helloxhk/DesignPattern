package com.pattern.behavior.a_chain_of_responsibility.custom_interceptor;

/**
 * 拦截器2
 * @author xhk
 * @date 2018年2月23日
 */
public class SecondInterceptor implements Interceptor {

	@Override
	public void intercept(Invocation invocation) {
		System.out.println("拦截器2 执行前");
		invocation.invoke();
		System.out.println("拦截器2 执行后");
	}

}
