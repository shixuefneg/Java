package com.test1;
/**
 * ѧ����
 * @author shixuefeng
 *
 */
public class Student {
	private String name;   //����
	private String sex;     //�Ա�
	private int age;      //����
	private String address; // ��ַ
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String sex, int age, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	
	
	
}
