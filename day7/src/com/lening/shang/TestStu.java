package com.lening.shang;

public class TestStu {
	public static void main(String[] args) {
		Student sydStu = new Student();
		System.out.println("��ֵǰ��");
		sydStu.show();
		sydStu.name = "ʯ����";
		sydStu.sex = "��";
		sydStu.age = 19;
		System.out.println("��ֵ��");
		sydStu.show();
	}
}
