package com.pattern.behavior.c_interpreter;

/**
 * 解释器模式
 * @author xhk
 * @date 2018年2月23日
 */
public class MainClass {

	private static Expression isMaleExpression(){
		TerminalExpression tom = new TerminalExpression("tom");
		TerminalExpression jerry = new TerminalExpression("jerry");
		return new OrExpression(tom, jerry);
	}
	
	private static Expression isMarriedFemale(){
		TerminalExpression married = new TerminalExpression("married");
		TerminalExpression mary = new TerminalExpression("mary");
		return new AndExpression(married, mary);
	}
	
	public static void main(String[] args) {
		Expression isMaleExpression = isMaleExpression();
		
		Expression isMarriedFemale = isMarriedFemale();
		
		System.out.println("tom is male? " + isMaleExpression.interpret("tom"));
		System.out.println("bob is male? " + isMaleExpression.interpret("bob"));
		
		System.out.println();
		
		System.out.println("mary is a married woman? " + isMarriedFemale.interpret("married mary"));
		System.out.println("mario is a married woman? " + isMarriedFemale.interpret("married mario"));
		
	}
	
}
