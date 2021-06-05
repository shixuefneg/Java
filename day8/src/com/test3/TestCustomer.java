package com.test3;

public class TestCustomer {
	public static void main(String[] args) {
		//实例化对象
		CustomerBiz cbiz = new CustomerBiz();
		//创建顾客对象，添加到数组中
		Customer cus = new Customer();
		cus.name = "王一";
		cus.age = 30;
		cus.hasCard = false;
		
		Customer cus2 = new Customer();
		cus2.name = "郝强";
		cus2.age = 19;
		cus2.hasCard = true;
		//添加
		cbiz.addCus(cus);
		cbiz.addCus(cus2);
		
		//遍历
		cbiz.showCustomer();
	}
}
