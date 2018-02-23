package com.pattern.behavior.a_chain_of_responsibility;

/**
 * 责任链模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	public static void main(String[] args) {
		AbstractLogger logger = getChainOfLoggers();
		
		logger.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println();
		logger.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
		System.out.println();
		logger.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

	private static AbstractLogger getChainOfLoggers(){
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
	
}
