package com.pattern.structure.adapter;

/**
 * Vlc播放器
 * @author xhk
 * @date 2018年2月22日
 */
public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		 System.out.println("Playing vlc file. Name: "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// nothing to do 
	}
	
}
