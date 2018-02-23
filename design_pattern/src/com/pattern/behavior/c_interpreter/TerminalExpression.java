package com.pattern.behavior.c_interpreter;

/**
 * 实际表达式
 * @author xhk
 * @date 2018年2月23日
 */
public class TerminalExpression implements Expression {

	private String desc;
	
	public TerminalExpression(String desc) {
		this.desc = desc;
	}

	@Override
	public boolean interpret(String data) {
		if(data.contains(desc)){
			return true;
		}
		return false;
	}

}
