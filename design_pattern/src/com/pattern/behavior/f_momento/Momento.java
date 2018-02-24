package com.pattern.behavior.f_momento;

/**
 * 备忘录类
 * @author xhk
 * @date 2018年2月24日
 */
public class Momento {

	private String state;

	public Momento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
