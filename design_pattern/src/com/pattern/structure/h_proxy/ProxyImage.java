package com.pattern.structure.h_proxy;

/**
 * 代理图像
 * @author xhk
 * @date 2018年2月23日
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
