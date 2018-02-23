package com.pattern.behavior.b_command;

/**
 * 卖货命令
 * @author xhk
 * @date 2018年2月23日
 */
public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}

}
