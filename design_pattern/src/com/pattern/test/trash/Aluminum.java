package com.pattern.test.trash;

public class Aluminum extends Trash {

	static double val = 1.67f;
	
	public Aluminum(double weight) {
		super(weight);
	}

	@Override
	double value() {
		return val;
	}

	static void value(double newVal){
		val = newVal;
	}
}
