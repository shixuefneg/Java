package DuoTai;

public class Cat extends Pet{
	private String sex;		//性别
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Cat() {
	}
	
	public Cat(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Cat [sex=" + sex + ", name=" + name + ", health=" + health
				+ ", love=" + love + "]";
	}
	
	@Override
	public void print() {
		System.out.println(name+"\t"+sex+"\t"+health+"\t"+love);
	}
	
	/**
	 * 猫吃鱼
	 */
	@Override
	public void eat() {
		System.out.println("猫的在吃鱼之前的健康值是:"+health);
		System.out.println("猫正在吃鱼");
		setHealth(health+5);
		System.out.println("猫吃完了鱼，健康值增加了5，现在值是:"+health);
	}
	
	/**
	 * 接球游戏
	 */
	public void catchBall(){
		System.out.println("猫在玩儿接球游戏之前的其密度是:"+love);
		System.out.println("猫正在玩儿接球游戏");
		setLove(love+3);
		System.out.println("猫玩儿完了游戏，亲密度增加了3，现在值是:"+love);
	}
}
