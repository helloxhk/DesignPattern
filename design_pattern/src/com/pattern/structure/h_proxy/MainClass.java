package com.pattern.structure.h_proxy;

/**
 * 代理模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像将没有从磁盘加载
		image.display();
	}

}
