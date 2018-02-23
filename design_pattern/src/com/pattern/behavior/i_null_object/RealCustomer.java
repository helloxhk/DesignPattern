package com.pattern.behavior.i_null_object;

/**
 * 真实客户
 * @author xhk
 * @date 2018年2月23日
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}
}
