package com.Test1;

/**
 * ƻ���ֻ� 
 *
 */
public class Iphone extends Phone{
	
	private String color;		//��ɫ

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Iphone() {
		
	}

	public Iphone(String brand, double price, String area, String color) {
		super(brand, price, area);
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("Ʒ��:"+brand+"���۸�:"+price+"������:"+area+"����ɫ:"+color);		
	}

	@Override
	public void jiangjia() {
		System.out.println("ԭ�ۣ�"+price);
		price = price -1000;
		System.out.println("����֮��ļ۸�:"+price);
	}
	
	
}
