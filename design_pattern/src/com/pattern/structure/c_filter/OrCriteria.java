package com.pattern.structure.c_filter;

import java.util.List;

/**
 * 满足一个
 * @author xhk
 * @date 2018年2月23日
 */
public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> first = criteria.meetCriteria(persons);
		List<Person> second = otherCriteria.meetCriteria(persons);
		for (Person person : second) {
			if(!first.contains(person)){
				first.add(person);
			}
		}
		return first;
	}

}
