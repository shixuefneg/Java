package com.Test1;

/**
 * 手机类   抽象父类
 * @author KingWin
 *1、定义手机分类  品牌 价格 产地
 *2、写get set 方法
 *3、创建无参有参
 *4、写抽象方法  public abstract void 参数名（）；
 */
public abstract class Phone {
	protected String brand;		//品牌
	protected double price;		//价格
	protected String area;		//产地
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String brand, double price, String area) {
		super();
		this.brand = brand;
		this.price = price;
		this.area = area;
	}
	
	/**
	 * 展示信息
	 */
	public abstract void show();
	
	/**
	 * 降价
	 */
	public abstract void jiangjia();
	
}
