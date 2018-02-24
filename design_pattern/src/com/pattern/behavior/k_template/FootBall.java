package com.pattern.behavior.k_template;

/**
 * 篮球游戏
 * @author xhk
 * @date 2018年2月24日
 */
public class FootBall extends Game {

	@Override
	void initialize() {
		System.out.println("football --> initialize");
	}

	@Override
	void startGame() {
		System.out.println("football --> start");
	}

	@Override
	void endGame() {
		System.out.println("football --> end");
	}

}
