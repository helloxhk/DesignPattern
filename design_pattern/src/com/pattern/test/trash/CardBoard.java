package com.pattern.test.trash;

public class CardBoard extends Trash {

	static double val = 0.15f;
	
	public CardBoard(double weight) {
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
