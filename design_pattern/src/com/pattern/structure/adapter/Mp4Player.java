package com.pattern.structure.adapter;

/**
 * Vlc播放器
 * @author xhk
 * @date 2018年2月22日
 */
public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// nothing to do 
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);
	}
	
}
