package com.pattern.test.trash;

public class Paper2 extends Paper implements TypeBinMember{

	public Paper2(double weight) {
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
