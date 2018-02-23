package com.pattern.behavior.a_chain_of_responsibility.custom_interceptor;

/**
 * 自定义拦截器接口
 * @author xhk
 * @date 2018年2月23日
 */
public interface Interceptor {

	void intercept(Invocation invocation);
}
