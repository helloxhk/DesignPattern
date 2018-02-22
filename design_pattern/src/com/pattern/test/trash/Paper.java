package com.pattern.test.trash;

public class Paper extends Trash {

	static double val = 0.10f;
	
	public Paper(double weight) {
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
