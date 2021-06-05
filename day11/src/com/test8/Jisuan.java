package com.test8;

public  class Jisuan extends Employee {
	protected double xishu=2;


	

	public Jisuan() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Jisuan(String name, int ghao, double gzi) {
		super(name, ghao, gzi);
		// TODO Auto-generated constructor stub
	}




	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		System.out.println("经理员工计算奖金的方法："+(gzi*xishu));
	}
}
