package com.test4;

/**
 * ���м�
 * @author KingWin
 *
 */
public class Banker extends Person{

	@Override
	public void sleep() {
		System.out.println("���м�������Ϣ��");
	}

	@Override
	public void walk() {
		System.out.println("���м�����ɢ����");
	}

	/**
	 * Ͷ��
	 */
	public void invest(){
		System.out.println("���м����ڲ���ĳ֪����Ŀ��Ͷ�ʣ�");
	}
}
