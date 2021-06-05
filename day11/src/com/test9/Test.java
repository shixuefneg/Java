package com.test9;

public class Test {
	public static void main(String[] args) {
		//实例化打印机对象
		Printer daYinJi = new Printer();
		
		//实例化彩色墨盒对象
		BlackWhiteInkBox b = new BlackWhiteInkBox();
		
		ColorInkBox c = new ColorInkBox();
		
		//实例化A4纸张对象
		A4Paper a4 = new A4Paper();
		B5Paper b5 = new B5Paper();
		
		daYinJi.setInkBox(c);
		daYinJi.setPaper(b5);
		
		daYinJi.print();
	}
}
