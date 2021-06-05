package com.test8;


public abstract class Employee {
	protected String name;
	protected int ghao;
	protected double gzi;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int ghao, double gzi) {
		super();
		this.name = name;
		this.ghao = ghao;
		this.gzi = gzi;
	}
	public abstract void bonus();
		
	
}
