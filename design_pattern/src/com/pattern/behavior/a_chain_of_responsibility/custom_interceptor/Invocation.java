package com.pattern.behavior.a_chain_of_responsibility.custom_interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行拦截器的类 
 * 		核心
 * @author xhk
 * @date 2018年2月23日
 */
public class Invocation {
	
	private List<Interceptor> interceptors = new ArrayList<>();
	
	private int index = -1;
	
	public void addInterceptor(Interceptor interceptor){
		interceptors.add(interceptor);
	}
	
	public void invoke(){
		index++;
		if(index < interceptors.size()){
			interceptors.get(index).intercept(this);
		} else {
			new Action().execute(); 
		}
	}
	
}
