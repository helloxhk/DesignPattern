package com.pattern.behavior.f_momento;

/**
 * 原始类
 * @author xhk
 * @date 2018年2月24日
 */
public class Originator {
	
	private String state;
	
	/**
	 * 存档
	 * @param state
	 * @return
	 */
	public Momento momento(){
		return new Momento(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * 回档
	 * @param momento
	 */
	public void getStateFromMomento(Momento momento){
		state = momento.getState();
	}
	
}
