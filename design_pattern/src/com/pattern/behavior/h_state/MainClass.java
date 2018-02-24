package com.pattern.behavior.h_state;

/**
 * 状态模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		Context context = new Context();
		
		context.setState(new StartState());
		context.doSomething();
		
		context.setState(new StopState());
		context.doSomething();
		
	}

}
