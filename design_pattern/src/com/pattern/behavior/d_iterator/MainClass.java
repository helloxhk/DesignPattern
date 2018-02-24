package com.pattern.behavior.d_iterator;

/**
 * 迭代器模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		NameRepository names = new NameRepository();
		for (Iterator itr = names.iterator(); itr.hasNext(); ) {
			String name = (String) itr.next();
			System.out.println(name);
		}
	}

}
