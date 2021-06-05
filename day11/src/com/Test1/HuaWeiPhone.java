package com.Test1;

/**
 * 华为手机类
 * 1、继承父类 使用继承关键子 extends 父类名  
 * 2、get set 方法
 * 3、无参有参方法
 * 4、调用继承方法 
 */
public class HuaWeiPhone extends Phone{

	private String type;		//型号
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public HuaWeiPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HuaWeiPhone(String brand, double price, String area, String type) {
		super(brand, price, area);
		this.type = type;
	}

	@Override
	public void show() {
		System.out.println("品牌:"+brand+"，价格:"+price+"，产地:"+area+"，型号:"+type);
	}

	@Override
	public void jiangjia() {
		System.out.println("原价："+price);
		price = price - 500;
		System.out.println("降价之后的价格:"+price);
	}

}
