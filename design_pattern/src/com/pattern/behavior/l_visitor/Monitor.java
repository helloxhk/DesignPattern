package com.pattern.behavior.l_visitor;

/**
 * 显示器
 * @author xhk
 * @date 2018年2月24日
 */
public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
