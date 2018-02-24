package com.pattern.behavior.k_template;

/**
 * 篮球游戏
 * @author xhk
 * @date 2018年2月24日
 */
public class BasketBall extends Game {

	@Override
	void initialize() {
		System.out.println("basketball --> initialize");
	}

	@Override
	void startGame() {
		System.out.println("basketball --> start");
	}

	@Override
	void endGame() {
		System.out.println("basketball --> end");
	}

}
