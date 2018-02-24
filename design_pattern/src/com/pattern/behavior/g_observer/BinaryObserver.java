package com.pattern.behavior.g_observer;

/**
 * 二进制观察者
 * @author xhk
 * @date 2018年2月24日
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("binary update --> " + Integer.toBinaryString(subject.getState()));
	}

}
