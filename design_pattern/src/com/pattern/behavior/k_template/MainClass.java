package com.pattern.behavior.k_template;

/**
 * 模板模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		BasketBall basketball = new BasketBall();
		basketball.play();
		
		System.out.println();
		
		FootBall footBall = new FootBall();
		footBall.play();
	}

}
