package com.pattern.behavior.h_state;

/**
 * 结束状态
 * @author xhk
 * @date 2018年2月23日
 */
public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		return "stop";
	}

}
