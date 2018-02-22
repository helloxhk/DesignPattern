package com.pattern.test.trash;

import java.util.Vector;

public interface Fillable {
	void addTrash(Trash t);
}

class FillableVector implements Fillable {

	private Vector<Object> v;
	
	public FillableVector(Vector<Object> v) {
		this.v = v;
	}
	
	@Override
	public void addTrash(Trash t) {
		v.addElement(t);
	}
	
}