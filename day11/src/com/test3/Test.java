package com.test3;

public class Test {
	public static void main(String[] args) {
		
		//����ת��    ����ת����    �Զ�ת��
		Person p = new Man();
		p.walk();
		
		//����ת��    ����ת����	ǿ��ת��
		Man man = (Man)p;
		man.walk();
	}
}
