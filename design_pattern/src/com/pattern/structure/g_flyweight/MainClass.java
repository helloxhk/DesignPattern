package com.pattern.structure.g_flyweight;

/**
 * 享元模式
 * 		减少创建对象的数量，减少内存占用提高性能。
 * 		如：线程池。
 * 		   JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	private static String[] colors = {"black","blue","yellow","green","Red"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}
	
	private static int getRandomX(){
		return (int) (Math.random() * 100);
	}
	
	private static int getRandomY(){
		return (int) (Math.random() * 100);
	}
}
