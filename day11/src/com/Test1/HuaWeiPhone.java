package com.Test1;

/**
 * ��Ϊ�ֻ���
 * 1���̳и��� ʹ�ü̳йؼ��� extends ������  
 * 2��get set ����
 * 3���޲��вη���
 * 4�����ü̳з��� 
 */
public class HuaWeiPhone extends Phone{

	private String type;		//�ͺ�
	
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
		System.out.println("Ʒ��:"+brand+"���۸�:"+price+"������:"+area+"���ͺ�:"+type);
	}

	@Override
	public void jiangjia() {
		System.out.println("ԭ�ۣ�"+price);
		price = price - 500;
		System.out.println("����֮��ļ۸�:"+price);
	}

}
