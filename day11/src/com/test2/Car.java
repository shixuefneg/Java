package com.test2;

/**
 * ������
 * 
 *
 */
public class Car {

	public void run(){
		System.out.println("�µϳ�������ʻ��");
	}
	
	public void run(int speed){
		System.out.println("�µϳ�������"+speed+"km/h���ٶ���ʻ��");
	}
	
	public void run(String name,int speed){
		System.out.println("�µϳ�����"+name+"�ļ�ʻ����"+speed+"km/h���ٶ���ʻ��");
	}
}
