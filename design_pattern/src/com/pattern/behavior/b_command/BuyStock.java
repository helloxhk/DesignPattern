package com.pattern.behavior.b_command;

/**
 * 买货命令
 * @author xhk
 * @date 2018年2月23日
 */
public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}
