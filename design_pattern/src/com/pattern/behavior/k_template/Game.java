package com.pattern.behavior.k_template;

/**
 * 模板类(抽象)
 * @author xhk
 * @date 2018年2月24日
 */
public abstract class Game {
	
	abstract void initialize();
	abstract void startGame();
	abstract void endGame();
	
	/**
	 * 模板方法，固定不变的
	 */
	public final void play(){
		// 初始化游戏
		initialize();
		
		// 开始游戏
		startGame();
		
		// 结束游戏
		endGame();
	}
	
}
