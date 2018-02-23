package com.pattern.structure.f_facade;

import java.util.concurrent.Executors;

/**
 * 外观模式 
 * 		减少系统间的依赖
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
