package DuoTai;

/**
 * 主人类
 * @author KingWin
 */
public class Master {
	
	/**
	 * 喂宠物
	 * 以父类类型作为形式参数
	 * @param pet
	 */
	public void feed(Pet pet){
		//狗吃东西
		pet.eat();
	}
	
	/**
	 * 领养宠物
	 * 以父类类型作为方法的返回值类型
	 * @return
	 */
	public Pet getPet(String type){
		Pet pet = null;
		if (type.equals("狗")) {
			pet = new Dog("欢欢", 100, 100, "拉布拉多犬");
		}else if(type.equals("猫")){
			pet = new Cat("贝贝", 90, 90, "雌性");
		}else{
			pet = new Lion("辛巴", 100, 100, "黄色");
		}
		return pet;
	}
	
	/**
	 * 和宠物玩儿
	 * @param pet
	 */
	public void play(Pet pet){
		System.out.println("宠物主人正在和宠物玩儿：");
		if (pet instanceof Dog) {
			Dog dog = (Dog)pet;
			dog.catchFlyingDisc();
		}else if(pet instanceof Cat){
			Cat cat = (Cat)pet;
			cat.catchBall();
		}
	}
	
}
