package com.test2;

/**
 * 汽车类
 * 
 *
 */
public class Car {

	public void run(){
		System.out.println("奥迪车正在行驶！");
	}
	
	public void run(int speed){
		System.out.println("奥迪车正在以"+speed+"km/h的速度行驶！");
	}
	
	public void run(String name,int speed){
		System.out.println("奥迪车正在"+name+"的驾驶下以"+speed+"km/h的速度行驶！");
	}
}
