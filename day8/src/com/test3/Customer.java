package com.test3;

/**
 * 顾客类
 * @author KingWin
 *
 */
public class Customer {
	String name;	//姓名
	int age;		//年龄
	boolean hasCard;	//有无会员卡
	
	public void show(){
		System.out.println(name+"\t"+age+"\t"+hasCard);
	}
}
