package com.pattern.structure.c_filter;

import java.util.List;

/**
 * 同时满足
 * @author xhk
 * @date 2018年2月23日
 */
public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> meetCriteria = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(meetCriteria);
	}

}
