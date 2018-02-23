package com.pattern.behavior.b_command;

/**
 * 命令模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		Stock stock = new Stock();
		Broker broker = new Broker();
		broker.takeOrder(new BuyStock(stock));
		broker.takeOrder(new SellStock(stock));
		broker.placeOrder();
	}

}
