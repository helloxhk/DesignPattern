package com.pattern.behavior.g_observer;

/**
 * 观察者
 * @author xhk
 * @date 2018年2月24日
 */
public abstract class Observer {
	
	protected Subject subject;
	
	public abstract void update();
	
}
