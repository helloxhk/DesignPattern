package com.pattern.behavior.l_visitor;

/**
 * 电脑部件
 * @author xhk
 * @date 2018年2月24日
 */
public interface ComputerPart {
	
	void accept(ComputerPartVisitor visitor);
	
}
