package com.pattern.behavior.a_chain_of_responsibility;

/**
 * 标准日志打印
 * @author xhk
 * @date 2018年2月23日
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Standartd Console:Logger " + message);
	}

}
