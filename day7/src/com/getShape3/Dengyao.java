package com.getShape3;

import java.util.Scanner;

public class Dengyao {
	
	public void Deng1() {
		// TODO Auto-generated method stub
		System.out.println("hangshu");
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		
		for (int i = 1; i <= add; i++) {
	    	//��ӡ�ո�
	    	for (int j = 1; j <= add- i ; j++) {
	    		System.out.print(" ");
	    	}
	    	//��ӡ*
	    	for (int j = 1; j <= 2 * i - 1; j++) {
	    		System.out.print("*");
	    	}
	    	//����
	    	System.out.println();
		}
	}
}
