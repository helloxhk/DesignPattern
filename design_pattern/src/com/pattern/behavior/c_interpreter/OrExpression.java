package com.pattern.behavior.c_interpreter;

/**
 * ||
 * @author xhk
 * @date 2018年2月23日
 */
public class OrExpression implements Expression{

	private Expression expression1;
	private Expression expression2;
	
	public OrExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret(String data) {
		return expression1.interpret(data) || expression2.interpret(data);
	}
	
	
}
