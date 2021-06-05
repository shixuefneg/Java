package com.test3;

/**
 * 顾客信息操作类
 * @author KingWin
 *
 */
public class CustomerBiz {
	
	//顾客数组
	Customer[] customers = new Customer[5];
	
	/**
	 * 添加顾客信息
	 */
	public void addCus(Customer cus){
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = cus;
				break;
			}
		}
	}
	
	/**
	 * 遍历数组信息
	 */
	public void showCustomer(){
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null) {
				Customer customer = customers[i];
				customer.show();
			}
		}
	}
}
