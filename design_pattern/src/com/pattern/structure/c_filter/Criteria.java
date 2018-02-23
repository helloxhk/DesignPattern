package com.pattern.structure.c_filter;

import java.util.List;

/**
 * 标准
 * @author xhk
 * @date 2018年2月23日
 */
public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);
	
}
