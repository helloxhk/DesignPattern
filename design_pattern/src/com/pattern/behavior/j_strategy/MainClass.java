package com.pattern.behavior.j_strategy;

/**
 * 策略模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		Context context = new Context(new AddStrategy());
		System.out.println("1 + 1 = " + context.executeStrategy(1, 1));
		context = new Context(new SubstractStrategy());
		System.out.println("1 - 1 = " + context.executeStrategy(1, 1));
		context = new Context(new MultiplyStrategy());
		System.out.println("1 * 1 = " + context.executeStrategy(1, 1));
	}

}
