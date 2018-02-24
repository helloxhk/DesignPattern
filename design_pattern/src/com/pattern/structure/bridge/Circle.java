package com.pattern.structure.bridge;

public class Circle extends Shape {

	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}

}
