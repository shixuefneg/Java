package com.lening.maicai;

import java.util.Scanner;

public class CalcVege {
	
	public static void main(String[] args) {
		int[] jiage = new int[5];
		Scanner jg=new Scanner(System.in);
		System.out.println("�������߲˵ļ۸�");
		
		for(int i=0;i<jiage.length;i++){
		jiage[i]= jg.nextInt();
		
		
	}
		Avg sc=new Avg();
		System.out.println("ƽ���ۣ�"+sc.shucai(jiage));
		System.out.println("��ͼۣ�"+sc.ZDJ(jiage));
	}
	
}

