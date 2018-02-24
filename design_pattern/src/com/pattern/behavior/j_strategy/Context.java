package com.pattern.behavior.j_strategy;

/**
 * 执行策略的类
 * @author xhk
 * @date 2018年2月24日
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2){
		return strategy.operate(num1, num2);
	}
}
