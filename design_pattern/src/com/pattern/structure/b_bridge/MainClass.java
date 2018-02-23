package com.pattern.structure.b_bridge;

/**
 * 桥接模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 0, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 0, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
