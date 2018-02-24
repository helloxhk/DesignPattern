package com.pattern.behavior.g_observer;

/**
 * 八进制观察者
 * @author xhk
 * @date 2018年2月24日
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("octal update --> " + Integer.toOctalString(subject.getState()));
	}

}
