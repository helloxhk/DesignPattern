package com.pattern.behavior.f_momento;

import java.util.ArrayList;
import java.util.List;

/**
 * 存档地址
 * @author xhk
 * @date 2018年2月24日
 */
public class CareTaker {
	// 存档s
	private List<Momento> momentoes = new ArrayList<>();
	
	/**
	 * 存档
	 * @param momento
	 */
	public void addMomento(Momento momento) {
		momentoes.add(momento);
	}
	
	/**
	 * 读取存档
	 * @param index
	 * @return
	 */
	public Momento getMomento(int index){
		return momentoes.get(index);
	}
}
