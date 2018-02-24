package com.pattern.behavior.l_visitor;

/**
 * 电脑部件访问者
 * @author xhk
 * @date 2018年2月24日
 */
public interface ComputerPartVisitor {
	
	void visit(Computer computer);
	
	void visit(Monitor monitor);
	
	void visit(Mouse mouse);
	
	void visit(Keyboard keyboard);
	
}
