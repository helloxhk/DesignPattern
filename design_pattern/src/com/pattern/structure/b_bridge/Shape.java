package com.pattern.structure.b_bridge;

/**
 * 使用DrawAPI的抽象类
 * @author xhk
 * @date 2018年2月22日
 */
public abstract class Shape {

	protected DrawAPI drawApi;
	
	public Shape(DrawAPI drawApi) {
		this.drawApi = drawApi;
	}
	
	public abstract void draw();
	
}
