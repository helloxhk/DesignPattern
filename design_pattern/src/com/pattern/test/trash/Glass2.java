package com.pattern.test.trash;

public class Glass2 extends Glass implements TypeBinMember{

	public Glass2(double weight) {
		super(weight);
	}

	@Override
	public boolean addToBin(TypeBin[] bins) {
		for (TypeBin typeBin : bins) {
			return typeBin.add(this);
		}
		return false;
	}
}
