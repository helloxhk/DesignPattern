package com.pattern.structure.bridge;

public class MainClass {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 0, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 0, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
