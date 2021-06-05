package com.test4;

/**
 * 银行家
 * @author KingWin
 *
 */
public class Banker extends Person{

	@Override
	public void sleep() {
		System.out.println("银行家正在休息！");
	}

	@Override
	public void walk() {
		System.out.println("银行家正在散步！");
	}

	/**
	 * 投资
	 */
	public void invest(){
		System.out.println("银行家正在参与某知名项目的投资！");
	}
}
