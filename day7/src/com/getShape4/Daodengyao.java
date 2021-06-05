package com.getShape4;

import java.util.Scanner;

public class Daodengyao {
	public void DaoDeng() {
		// TODO Auto-generated method stub
		System.out.println("行数：");
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		
		for (int i = add; i >= 1; i--) {
	    	//打印空格
	    	for (int j = 1; j <= add- i ; j++) {
	    		System.out.print(" ");
	    	}
	    	//打印*
	    	for (int j = 1; j <= 2 * i - 1; j++) {
	    		System.out.print("*");
	    	}
	    	//换行
	    	System.out.println();
		}
	}}
