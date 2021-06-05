package test7;

public class TestPet {
	public static void main(String[] args) {
		Dog dog = new Dog("欢欢", 100, 100, "拉布拉多犬");
		System.out.println(dog.toString());
		
		//父类    new  子类
		//cat 数据类型属于  父类类型Pet
		//创建出来的是一个子类cat对象
		Pet cat = new Cat("贝贝", 90, 90, "雌性");
		System.out.println(cat.toString());
		
		
	}
}
