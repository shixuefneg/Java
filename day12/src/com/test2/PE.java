package com.test2;
/*
 * 普通员工类
 */
public class PE extends Employee {
	private final double XI =1.5;

	public PE() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PE(String name, String workNo, double salary) {
		super(name, workNo, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		double salary =getSalary();
		salary = salary*XI;
		System.out.println("工号："+workNo+",姓名："+name+",工资："+salary);
	}
	
}
