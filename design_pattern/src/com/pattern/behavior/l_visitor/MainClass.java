package com.pattern.behavior.l_visitor;

/**
 * 访问者模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		ComputerPartVisitor visitor = new ComputerVisitor();

		Computer computer = new Computer();
		computer.accept(visitor);
		
		Monitor monitor = new Monitor();
		monitor.accept(visitor);
		
		Keyboard keyboard = new Keyboard();
		keyboard.accept(visitor);
		
		Mouse mouse = new Mouse();
		mouse.accept(visitor);
	}

}
