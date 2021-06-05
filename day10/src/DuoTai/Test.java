package DuoTai;

public class Test {
public static void main(String[] args) {
	//实例化宠物主人对象
			Master m= new Master();
			//领养宠物
			Pet dog =m.getPet("狗");
			m.feed(dog);
			m.play(dog);	
			Pet cat =m.getPet("猫");
			//喂宠物
			m.feed(cat);
			m.play(cat);
			//喂狮子
			Pet lion = m.getPet("狮子");
			m.feed(lion);
			m.play(lion);
}
}
