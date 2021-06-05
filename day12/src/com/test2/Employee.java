package com.test2;

public abstract class Employee {
	protected String name;
	protected String workNo;  //工号
	protected double salary;  //工资
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkNo() {
		return workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String workNo, double salary) {
		super();
		this.name = name;
		this.workNo = workNo;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", workNo=" + workNo + ", salary="
				+ salary + "]";
	}
	//计算工资的抽象方法
	public abstract void bonus();
}
