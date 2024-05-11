package com.list;

public class Employee {
	private int empid;
	private String name;
	private String department;
	private String title;

	public Employee() {
		//System.out.println("Inside emp Parameterless ctor");

	}

	public Employee(int empid,String name,String department,String title) {
		//System.out.println("Inside emp Parameterized ctor");
		this.empid = empid;
		this.name = name;
		this.department = department;
		this.title =title;
	}

	public int getEmpid() {
		return this.empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return  " Employee empid:"+empid+ " Name:"+name+ " Department:"+department+ " title:"+title;
	}

}




