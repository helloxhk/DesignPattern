package com.pattern.structure.b_bridge;

/**
 * 红圆圈
 * @author xhk
 * @date 2018年2月22日
 */
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		 System.out.println("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}
