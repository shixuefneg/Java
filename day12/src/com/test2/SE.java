package com.test2;
/*
 * ������
 */
public class SE extends Employee {
	//����ϵ��
	private final double XI=2;

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		double salary = getSalary();
		salary = salary * XI;
		System.out.println("����:"+workNo+",����:"+name+",������:"+salary);
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
