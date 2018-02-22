package com.pattern.test.trash;

import java.util.Enumeration;
import java.util.Vector;

public class RecycleA {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		/*for (int i = 0; i < 30; i++) {
			// version 1.0
			switch((int)(Math.random() * 3)){
				case 0 :
					v.addElement(new Aluminum(Math.random() * 100));
					break;
				case 1 :
					v.addElement(new Paper(Math.random() * 100));
					break;
				case 2 :
					v.addElement(new Glass(Math.random() * 100));
					break;
				default :
			}
			
			// version 2.0
			Trash t = Trash.factory(new Info((int)(Math.random() * Info.MAX_NUM), (int)(Math.random() * 100)));
			v.addElement(t);
		}*/
		
		// version 3.0
		ParseTrase.fillBin("trashes.properties", new FillableVector(v));
		
		Vector<Object> aluminums = new Vector<>();
		Vector<Object> papers = new Vector<>();
		Vector<Object> glasses = new Vector<>();
		
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements()){
			Object o = e.nextElement();
			if(o instanceof Aluminum){
				aluminums.addElement(o);
			} else if(o instanceof Paper){
				papers.addElement(o);
			} else if(o instanceof Glass){
				glasses.addElement(o);
			}
		}
		
		Trash.sumValue(aluminums);
		Trash.sumValue(papers);
		Trash.sumValue(glasses);
	}

}
