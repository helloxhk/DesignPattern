package com.pattern.behavior.b_command;

/**
 * 库存
 * @author xhk
 * @date 2018年2月23日
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void buy(){
		 System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
	}

	public void sell(){
		System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
	}

}
