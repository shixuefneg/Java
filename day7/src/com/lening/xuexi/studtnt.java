package com.lening.xuexi;

import java.util.Scanner;

public class studtnt {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	Student yyds = new Student();
	System.out.println("������������");
	yyds.name=input.next();
	System.out.println("���������䣺");
	yyds.age=input.nextInt();
	System.out.println("������༶��");
	yyds.clas=input.next();
	System.out.println("������Java�ɼ���");
	yyds.Javacj=input.nextInt();
	System.out.println("��������Ļ��γɼ���");
	yyds.whcj=input.nextInt();
	System.out.println("������C���Գɼ���");
	yyds.Ccj=input.nextInt();
	yyds.student();
	
}
}
