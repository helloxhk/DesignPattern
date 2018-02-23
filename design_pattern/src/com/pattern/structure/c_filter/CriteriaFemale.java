package com.pattern.structure.c_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出女性
 * @author xhk
 * @date 2018年2月23日
 */
public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
