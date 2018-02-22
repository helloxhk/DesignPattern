package com.pattern.test.trash;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Vector;

public abstract class Trash {
	
	// 重量
	private double weight;
	
	public Trash(double weight) {
		this.weight = weight;
	}
	
	// 获取值，需子类实现 
	abstract double value();
	
	// 获取重量
	double weight(){
		return this.weight;
	}
	
	// 计算垃圾价值
	@SuppressWarnings("rawtypes")
	static void sumValue(Vector v){
		Enumeration e = v.elements();
		double val = 0.0f;
		while(e.hasMoreElements()){
			Trash t = (Trash) e.nextElement();
			val += t.weight * t.value();
			System.out.println("weight of " + t.getClass().getName() + " = " + t.weight);
		}
		System.out.println("total value = " + val);
	}
	
	@SuppressWarnings("serial")
	private static class PrototypeNotFoundException extends Exception {}
	@SuppressWarnings("serial")
	private static class CannotCreateTrashException extends Exception {}
	
	@SuppressWarnings("rawtypes")
	private static Vector trashTypes = new Vector<>();
	
	/**
	 * 用于创建Trash对象
	 * 		根据Info提供的信息创建不同的Trash子类对象
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static Trash factory(Info info) throws CannotCreateTrashException, PrototypeNotFoundException{
		/*// version 2.0
		switch(info.type){
			case 0 :
				return new Aluminum(info.data);
			case 1 :
				return new Paper(info.data);
			case 2 :
				return new Glass(info.data);
			case 3 :
				return new CardBoard(info.data);
			default :
				return null;
		}*/
		for (int i = 0; i < trashTypes.size(); i++) {
			Class c = (Class)trashTypes.elementAt(i);
			if(c.getName().indexOf(info.className) != -1){
				try {
					Constructor cons = c.getConstructor(double.class);
					return (Trash) cons.newInstance(info.data);
				} catch (Exception e) {
					e.printStackTrace();
					throw new CannotCreateTrashException();
				}
				
			}
		}
		
		try {
			trashTypes.addElement(Class.forName(info.className));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new PrototypeNotFoundException();
		}
		
		return factory(info);
	}
	
}
