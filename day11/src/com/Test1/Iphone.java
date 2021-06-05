package com.Test1;

/**
 * 苹果手机 
 *
 */
public class Iphone extends Phone{
	
	private String color;		//颜色

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
		System.out.println("品牌:"+brand+"，价格:"+price+"，产地:"+area+"，颜色:"+color);		
	}

	@Override
	public void jiangjia() {
		System.out.println("原价："+price);
		price = price -1000;
		System.out.println("降价之后的价格:"+price);
	}
	
	
}
