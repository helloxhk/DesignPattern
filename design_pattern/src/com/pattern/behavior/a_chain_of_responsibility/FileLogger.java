package com.pattern.behavior.a_chain_of_responsibility;

/**
 * 文件日志打印
 * @author xhk
 * @date 2018年2月23日
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("File Console:Logger " + message);
	}

}
