package com.test2;
/*
 * ��ͨԱ����
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
		System.out.println("���ţ�"+workNo+",������"+name+",���ʣ�"+salary);
	}
	
}
