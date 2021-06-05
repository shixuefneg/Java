package com.lening.chaoshi;

import java.util.Scanner;

public class supMar {
public static void main(String[] args) {
	SuperMarket supMar = new SuperMarket();
	Scanner sc = new Scanner(System.in);
	System.out.println("超市名称：");
	
	supMar.ShopName=sc.next();
	System.out.println("超市地址：");
	supMar.ShopDz=sc.next();
	System.out.println("超市电话号：");
	supMar.ShopDhh=sc.nextInt();
	supMar.show();
			}
}
