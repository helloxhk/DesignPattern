package com.pattern.test.trash;

import java.util.Enumeration;
import java.util.Vector;

public class RecycleB {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TBin bin = new TBin(Trash.class);
		ParseTrase.fillBin("trashes.properties", bin);
		
		TBinList list = new TBinList();
		list.add(new TBin(Aluminum.class));
		list.add(new TBin(Paper.class));
		list.add(new TBin(Glass.class));
		list.add(new TBin(CardBoard.class));
		
		list.sortBin(bin);
		
//		Enumeration<Object> e = list.elements();
//		while(e.hasMoreElements()){
//			TBin o = (TBin) e.nextElement();
//			Trash.sumValue(o);
//		}
		
		Trash.sumValue(bin);
	}

}
