package com.getShape2;

import java.util.Scanner;

public class Daozhijiao {
	public void Dzj() {
		System.out.println("ÇëÊäÈëÐÐÊý");
		Scanner sc=new Scanner(System.in);
		int add=sc.nextInt();
		
		// TODO Auto-generated method stub
		for (int i = add; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
