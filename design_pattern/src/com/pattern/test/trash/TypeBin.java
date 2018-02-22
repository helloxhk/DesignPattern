package com.pattern.test.trash;

import java.util.Enumeration;
import java.util.Vector;

public abstract class TypeBin {
	Vector<Object> v = new Vector<>();
	protected boolean addIt(Trash t){
		v.addElement(t);
		return true;
	}
	
	public Enumeration<Object> elements(){
		return v.elements();
	}
	
	public boolean add(Paper2 papaer){
		return false;
	}
	
	public boolean add(Glass2 glass){
		return false;
	}
}
