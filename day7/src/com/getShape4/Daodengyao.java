package com.getShape4;

import java.util.Scanner;

public class Daodengyao {
	public void DaoDeng() {
		// TODO Auto-generated method stub
		System.out.println("������");
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		
		for (int i = add; i >= 1; i--) {
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
	}}
