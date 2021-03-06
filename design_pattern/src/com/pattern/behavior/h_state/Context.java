package com.pattern.behavior.h_state;

/**
 * 内容类
 * @author xhk
 * @date 2018年2月23日
 */
public class Context {
	
	private State state;
	
	public Context() {
		this.state = new DefaultState();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void doSomething(){
		state.doAction(this);
	}
	
}
