package com.test3;

public class TestCustomer {
	public static void main(String[] args) {
		//ʵ��������
		CustomerBiz cbiz = new CustomerBiz();
		//�����˿Ͷ�����ӵ�������
		Customer cus = new Customer();
		cus.name = "��һ";
		cus.age = 30;
		cus.hasCard = false;
		
		Customer cus2 = new Customer();
		cus2.name = "��ǿ";
		cus2.age = 19;
		cus2.hasCard = true;
		//���
		cbiz.addCus(cus);
		cbiz.addCus(cus2);
		
		//����
		cbiz.showCustomer();
	}
}
