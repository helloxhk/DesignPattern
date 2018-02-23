package com.pattern.behavior.a_chain_of_responsibility;

/**
 * 日志抽象类
 * @author xhk
 * @date 2018年2月23日
 */
public abstract class AbstractLogger {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level, String message){
		if(level <= this.level){
			write(message);
		}
		
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}

	protected abstract void write(String message);
	
}
