package com.pattern.behavior.g_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题（被观察）
 * @author xhk
 * @date 2018年2月24日
 */
public class Subject {
	
	private List<Observer> observers = new ArrayList<>();
	
	private int state;

	public int getState() {
		return state;
	}

	/**
	 * 主题修改后所有观察者都要修改
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	/**
	 * 绑定观察者
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
