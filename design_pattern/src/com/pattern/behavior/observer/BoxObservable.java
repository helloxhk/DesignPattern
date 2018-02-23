package com.pattern.behavior.observer;

import java.util.Observable;

public class BoxObservable extends Observable {
	@Override
	public void notifyObservers(Object arg) {
		setChanged();
		super.notifyObservers(arg);
	}
}