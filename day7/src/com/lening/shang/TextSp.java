package com.lening.shang;

public class TextSp {
	public static void main(String[] args) {
		
		ShangPing neSpxx = new ShangPing();
		System.out.println("赋值前：");
		neSpxx.spxx();
		
		neSpxx.spjg=1000;
		neSpxx.spbh=2;
		neSpxx.spmc="电器";
		System.out.println("赋值后：");
		neSpxx.spxx();
		}
	}
