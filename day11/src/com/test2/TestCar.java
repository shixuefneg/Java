package com.test2;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car();
		
		//重载的方法调用，根据参数个数和类型的不同实现不同的调用
		car.run();
		car.run(180);
		car.run("李明",120);
	}
}
