package com.test10;

public class Computer implements JiSuanJi {

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println("两int数相加:"+sum);
	}

	@Override
	public void add(double a, double b) {
		// TODO Auto-generated method stub
		double sum=a+b;
		System.out.println("两double数相加:"+sum);
	}
	
}
