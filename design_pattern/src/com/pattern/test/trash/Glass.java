package com.pattern.test.trash;

public class Glass extends Trash {

	static double val = 0.23f;
	
	public Glass(double weight) {
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
