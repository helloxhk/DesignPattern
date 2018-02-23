package com.pattern.behavior.b_command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * @author xhk
 * @date 2018年2月23日
 */
public class Broker {
	
	private List<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order){
		orders.add(order);
	}
	
	public void placeOrder(){
		for (Order order : orders) {
			order.execute();
		}
		orders.clear();
	}
	
}
