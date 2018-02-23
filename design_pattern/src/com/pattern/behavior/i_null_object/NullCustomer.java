package com.pattern.behavior.i_null_object;

/**
 * 空客户
 * @author xhk
 * @date 2018年2月23日
 */
public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "not available customer";
	}

}
