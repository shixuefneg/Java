package com.test9;

public class Test {
	public static void main(String[] args) {
		//ʵ������ӡ������
		Printer daYinJi = new Printer();
		
		//ʵ������ɫī�ж���
		BlackWhiteInkBox b = new BlackWhiteInkBox();
		
		ColorInkBox c = new ColorInkBox();
		
		//ʵ����A4ֽ�Ŷ���
		A4Paper a4 = new A4Paper();
		B5Paper b5 = new B5Paper();
		
		daYinJi.setInkBox(c);
		daYinJi.setPaper(b5);
		
		daYinJi.print();
	}
}
