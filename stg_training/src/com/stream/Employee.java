package com.stream;

public class Employee {

	private int eid;
	private int salary;
	private String name;
	private String grade;
	public Employee(int eid, int salary, String name, String grade) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.grade = grade;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + ", grade=" + grade + "]";
	}

	
	
	
}
