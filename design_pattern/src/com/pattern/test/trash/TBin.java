package com.pattern.test.trash;

import java.util.Enumeration;
import java.util.Vector;

@SuppressWarnings("serial")
public class TBin extends Vector<Object> {
	// 垃圾类型
	Class<?> clazz;
	public TBin(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	// 判断当前垃圾是否属于本分类
	boolean addIfTrue(Trash t){
		if(t.getClass().equals(clazz)){
			this.addElement(t);
			return true;
		}
		return false;
	}
}

@SuppressWarnings({ "all" })
class TBinList extends Vector {
	
	// 将单个垃圾放入他应当存放的位置
	boolean sort(Trash t){
		Enumeration<?> e = this.elements();
		while(e.hasMoreElements()){
			TBin tbin = (TBin) e.nextElement();
			if(tbin.addIfTrue(t)){
				return true;
			}
		}
		return false;
	}
	
	// 将所有垃圾分别放入各自的垃圾箱
	void sortBin(TBin bin){
		Enumeration<Object> e = bin.elements();
		while(e.hasMoreElements()){
			if(!sort((Trash) e.nextElement())){
				System.out.println("Bin not found");
			}
		}
	}
}