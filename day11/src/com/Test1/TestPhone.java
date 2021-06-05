package com.Test1;

/**
 * 父类new子类创建的子类对象，
 * 在调用方法的时候，执行顺序是：
 * 先去子类中查找是否有将要执行的方法，如果有，则执行子类的方法
 * 如果没有，则执行父类中的方法
 * @author KingWin
 *
 */
public class TestPhone {
	public static void main(String[] args) {
		//父类  New  子类
		//创建子类对象
		Phone huaWei = new HuaWeiPhone("华为", 4999.9, "深圳", "鸿蒙");
		huaWei.show();
		huaWei.jiangjia();
		Phone Iphone =new Iphone("苹果", 8999, "美国", "白色");
		Iphone.show();
		Iphone.jiangjia();
	}
}
