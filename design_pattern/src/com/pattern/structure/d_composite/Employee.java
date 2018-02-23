package com.pattern.structure.d_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工
 * 
 * @author xhk
 * @date 2018年2月23日
 */
public class Employee {

	private String name;
	private String dept; // 部门
	private int salary; // 薪水
	private List<Employee> subordinates; // 下属

	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
