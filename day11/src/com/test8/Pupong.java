package com.test8;

public class Pupong extends Employee{
	protected double pp=1.5;
		
	
	public Pupong() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pupong(String name, int ghao, double gzi) {
		super(name, ghao, gzi);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		System.out.println("普通员工计算奖金的方法："+(gzi*pp));
	}
	
}
