package com.pattern.structure.a_adapter;

/**
 * 老旧的音频播放器
 * @author xhk
 * @date 2018年2月22日
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter adapter;

	@Override
	public void play(String audioType, String fileName) {
		// 播放 mp3 音乐文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);

		}
		// mediaAdapter 提供了播放其他文件格式的支持
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
