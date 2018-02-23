package com.pattern.structure.h_proxy;

/**
 * 图像
 * @author xhk
 * @date 2018年2月23日
 */
public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(this.fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
	
	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName);
	}

}
