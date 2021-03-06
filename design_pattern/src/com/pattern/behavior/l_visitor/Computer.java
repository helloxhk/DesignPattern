package com.pattern.behavior.l_visitor;

/**
 * 电脑
 * @author xhk
 * @date 2018年2月24日
 */
public class Computer implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
