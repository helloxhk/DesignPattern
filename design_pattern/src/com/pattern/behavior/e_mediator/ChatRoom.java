package com.pattern.behavior.e_mediator;

import java.util.Date;

/**
 * 聊天室（中介）
 * @author xhk
 * @date 2018年2月24日
 */
public class ChatRoom {

	@SuppressWarnings("deprecation")
	public static void showMessage(User user, String message) {
		System.out.println(user.getName() + "[" + new Date().toLocaleString() + "]:"
				+"\r\n\t" + message);
	}

}
