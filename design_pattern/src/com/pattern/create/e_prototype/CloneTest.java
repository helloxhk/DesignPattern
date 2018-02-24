package com.pattern.create.e_prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 浅复制
 * 		基本数据类型变量重新创建，引用数据类型仍然指向原对象的指向。
 * 深复制
 * 		基本数据类型和引用数据类型都重新创建，即完全复制。
 * @author xhk
 * @date 2018年2月22日
 */
public class CloneTest implements Cloneable,Serializable{
	
	private String id;
	
	private float money;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
	
	/**
	 * 浅复制
	 */
	@Override
	public Object clone() {
		Object obj = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	/**
	 * 深复制
	 * 		要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
	 */
	public Object deepClone(){
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
