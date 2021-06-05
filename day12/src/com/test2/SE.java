package com.test2;
/*
 * 经理类
 */
public class SE extends Employee {
	//工资系数
	private final double XI=2;

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		double salary = getSalary();
		salary = salary * XI;
		System.out.println("工号:"+workNo+",姓名:"+name+",工资是:"+salary);
	}

	public SE() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SE(String name, String workNo, double salary) {
		super(name, workNo, salary);
		// TODO Auto-generated constructor stub
	}
	
	
}
