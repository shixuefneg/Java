package com.test3;

/**
 * �˿���Ϣ������
 * @author KingWin
 *
 */
public class CustomerBiz {
	
	//�˿�����
	Customer[] customers = new Customer[5];
	
	/**
	 * ��ӹ˿���Ϣ
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
	 * ����������Ϣ
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
