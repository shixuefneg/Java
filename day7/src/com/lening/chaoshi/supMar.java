package com.lening.chaoshi;

import java.util.Scanner;

public class supMar {
public static void main(String[] args) {
	SuperMarket supMar = new SuperMarket();
	Scanner sc = new Scanner(System.in);
	System.out.println("�������ƣ�");
	
	supMar.ShopName=sc.next();
	System.out.println("���е�ַ��");
	supMar.ShopDz=sc.next();
	System.out.println("���е绰�ţ�");
	supMar.ShopDhh=sc.nextInt();
	supMar.show();
			}
}
