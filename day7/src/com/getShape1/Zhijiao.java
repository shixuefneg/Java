package com.getShape1;

import java.util.Scanner;

public class Zhijiao {
	

	public void ZhiJiao() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("ÐÐÊý:");
		int input = sc.nextInt();
	for(int i=1;i<=input;i++){
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	
}
