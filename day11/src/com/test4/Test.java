package com.test4;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.sleep();
		p.walk();
		
		Banker banker = new Banker();
		banker.eat();
		banker.sleep();
		banker.walk();
		banker.invest();
	}
}
