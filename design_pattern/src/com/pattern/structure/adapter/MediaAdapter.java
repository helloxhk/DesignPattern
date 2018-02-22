package com.pattern.structure.adapter;

/**
 * 适配器
 * @author xhk
 * @date 2018年2月22日
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer player;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")){
			player = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")){
			player = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			player.playVlc(fileName);
		} else if(audioType.equalsIgnoreCase("mp4")){
			player.playMp4(fileName);
		}
	}

}
