package com.getShape3;

import java.util.Scanner;

public class Dengyao {
	
	public void Deng1() {
		// TODO Auto-generated method stub
		System.out.println("hangshu");
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		
		for (int i = 1; i <= add; i++) {
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
	}
}
