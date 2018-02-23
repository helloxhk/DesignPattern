package com.pattern.structure.c_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出男性
 * @author xhk
 * @date 2018年2月23日
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
