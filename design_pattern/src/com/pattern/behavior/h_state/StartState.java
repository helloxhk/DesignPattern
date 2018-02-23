package com.pattern.behavior.h_state;

/**
 * 开始状态
 * @author xhk
 * @date 2018年2月23日
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		return "start";
	}

}
