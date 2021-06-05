package DuoTai;

public class TestPet {
	public static void main(String[] args) {
		//实例化宠物主人对象
		Master m = new Master();
		
		//喂狗
		//向上转型    子类转父类    自动转换
		Pet dog = new Dog("欢欢", 100, 100, "拉布拉多犬");
		m.feed(dog);
		
		//喂猫
		Pet cat = new Cat("贝贝", 90, 90, "雌性");
		m.feed(cat);
		
		//向下转型     父类转子类     强转
		Dog dog2 = (Dog)dog;
	}
}
