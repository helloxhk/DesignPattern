package com.pattern.behavior.e_mediator;

/**
 * 中介者模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		User jack = new User("jack");
		User mark = new User("mark");
		jack.sendMessage("hello mark.");
		mark.sendMessage("hi jack,goodmorning.");
	}

}
