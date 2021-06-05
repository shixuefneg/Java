package com.test7;

public class Printer implements Shape{

	@Override
	public void sanjiao() {
		// TODO Auto-generated method stub
			for (int i = 1; i <5; i++) {
				for(int j=1;j<=2*i-1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
	}

	@Override
	public void juxing() {
		// TODO Auto-generated method stub
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("***************");
	}

}
