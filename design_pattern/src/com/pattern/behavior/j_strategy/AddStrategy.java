package com.pattern.behavior.j_strategy;

/**
 * 两数相加
 * @author xhk
 * @date 2018年2月24日
 */
public class AddStrategy implements Strategy {

	@Override
	public int operate(int num1, int num2) {
		return num1 + num2;
	}

}
