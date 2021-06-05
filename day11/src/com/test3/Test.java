package com.test3;

public class Test {
	public static void main(String[] args) {
		
		//向上转型    子类转父类    自动转换
		Person p = new Man();
		p.walk();
		
		//向下转型    父类转子类	强制转换
		Man man = (Man)p;
		man.walk();
	}
}
