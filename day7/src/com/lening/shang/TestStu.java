package com.lening.shang;

public class TestStu {
	public static void main(String[] args) {
		Student sydStu = new Student();
		System.out.println("赋值前：");
		sydStu.show();
		sydStu.name = "石永栋";
		sydStu.sex = "男";
		sydStu.age = 19;
		System.out.println("赋值后：");
		sydStu.show();
	}
}
