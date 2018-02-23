package com.pattern.structure.a_adapter;

/**
 * 适配器模式
 * @author xhk
 * @date 2018年2月22日
 */
public class MainClass {

	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "beyond the horizon.mp3");
		player.play("mp4", "alone.mp4");
		player.play("vlc", "far far away.vlc");
		player.play("avi", "mind me.avi");
	}

}
