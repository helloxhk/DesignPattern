package com.pattern.behavior.g_observer;

/**
 * 观察者模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Observer observerBin = new BinaryObserver(subject);
		Observer observerOct = new OctalObserver(subject);
		
		subject.setState(8);
	}

}
