package com.pattern.behavior.l_visitor;

/**
 * 鼠标
 * @author xhk
 * @date 2018年2月24日
 */
public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
