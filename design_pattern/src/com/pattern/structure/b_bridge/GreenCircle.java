package com.pattern.structure.b_bridge;

/**
 * 绿圆圈
 * @author xhk
 * @date 2018年2月22日
 */
public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		 System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}
