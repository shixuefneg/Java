package com.lening.xuexi;

import java.util.Scanner;

public class studtnt {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	Student yyds = new Student();
	System.out.println("请输入姓名：");
	yyds.name=input.next();
	System.out.println("请输入年龄：");
	yyds.age=input.nextInt();
	System.out.println("请输入班级：");
	yyds.clas=input.next();
	System.out.println("请输入Java成绩：");
	yyds.Javacj=input.nextInt();
	System.out.println("请输入大文化课成绩：");
	yyds.whcj=input.nextInt();
	System.out.println("请输入C语言成绩：");
	yyds.Ccj=input.nextInt();
	yyds.student();
	
}
}
