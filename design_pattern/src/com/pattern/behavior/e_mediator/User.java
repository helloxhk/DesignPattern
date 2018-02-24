package com.pattern.behavior.e_mediator;

/**
 * 用户
 * @author xhk
 * @date 2018年2月24日
 */
public class User {
	
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
	
}
