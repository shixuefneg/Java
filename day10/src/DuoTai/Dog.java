package DuoTai;

/**
 * 狗类
 * @author KingWin
 *
 */
public class Dog extends Pet{
	private String strain;	//品种
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public Dog() {
		System.out.println("子类的无参构造方法");
	}
	
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
		System.out.println("子类的有参构造方法");
		
	}
	
	public void show(String name){
		//super  父类的对象
		//this   当前类的对象
		super.name = name;
	}
	@Override
	public String toString() {
		return "Dog [strain=" + strain + ", name=" + name + ", health="
				+ health + ", love=" + love + "]";
	}
	
	@Override
	public void print() {
		System.out.println(name+"\t"+strain+"\t"+health+"\t"+love);
	}
	
	/**
	 * 狗吃狗粮
	 */
	@Override
	public void eat() {
		System.out.println("狗的在吃狗粮之前的健康值是:"+health);
		System.out.println("狗正在吃狗粮");
		setHealth(health+3);
		System.out.println("狗吃完了狗粮，健康值增加了3，现在值是:"+health);
	}
	
	/**
	 * 接飞盘游戏
	 */
	public void catchFlyingDisc(){
		System.out.println("狗在玩儿接飞盘游戏之前的其密度是:"+love);
		System.out.println("狗正在玩儿接飞盘游戏");
		setLove(love+4);
		System.out.println("狗玩儿完了游戏，亲密度增加了4，现在值是:"+love);
	}
}
