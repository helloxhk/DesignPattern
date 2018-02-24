package com.pattern.behavior.l_visitor;

/**
 * 键盘
 * @author xhk
 * @date 2018年2月24日
 */
public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
