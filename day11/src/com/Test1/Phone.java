package com.Test1;

/**
 * �ֻ���   ������
 * @author KingWin
 *1�������ֻ�����  Ʒ�� �۸� ����
 *2��дget set ����
 *3�������޲��в�
 *4��д���󷽷�  public abstract void ������������
 */
public abstract class Phone {
	protected String brand;		//Ʒ��
	protected double price;		//�۸�
	protected String area;		//����
	
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
	 * չʾ��Ϣ
	 */
	public abstract void show();
	
	/**
	 * ����
	 */
	public abstract void jiangjia();
	
}
