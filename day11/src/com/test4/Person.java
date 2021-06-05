package com.test4;

/**
 * 父类
 * 1、final用他修饰的不能被调用
 *
 */
public class Person {
	
	/**
	 * 吃饭的方法
	 */
	public final void eat(){
		System.out.println("吃饭！");
	}
	
	/**
	 * 睡觉
	 */
	public void sleep(){
		System.out.println("人正在休息！");
	}
	
	/**
	 * 走路
	 */
	public void walk(){
		System.out.println("人正在散步！");
	}
}
