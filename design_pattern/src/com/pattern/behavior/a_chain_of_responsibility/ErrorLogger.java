package com.pattern.behavior.a_chain_of_responsibility;

/**
 * 错误日志打印
 * @author xhk
 * @date 2018年2月23日
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Error Console:Logger " + message);
	}

}
