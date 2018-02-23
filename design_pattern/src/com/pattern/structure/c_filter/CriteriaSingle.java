package com.pattern.structure.c_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出单身
 * @author xhk
 * @date 2018年2月23日
 */
public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
