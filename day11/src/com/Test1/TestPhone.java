package com.Test1;

/**
 * ����new���ഴ�����������
 * �ڵ��÷�����ʱ��ִ��˳���ǣ�
 * ��ȥ�����в����Ƿ��н�Ҫִ�еķ���������У���ִ������ķ���
 * ���û�У���ִ�и����еķ���
 * @author KingWin
 *
 */
public class TestPhone {
	public static void main(String[] args) {
		//����  New  ����
		//�����������
		Phone huaWei = new HuaWeiPhone("��Ϊ", 4999.9, "����", "����");
		huaWei.show();
		huaWei.jiangjia();
		Phone Iphone =new Iphone("ƻ��", 8999, "����", "��ɫ");
		Iphone.show();
		Iphone.jiangjia();
	}
}
