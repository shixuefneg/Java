package DuoTai;

/**
 * 宠物类（父类）
 * @author KingWin
 *	abstract 抽象类
 *	1、抽象类不能被实例化
 */
public abstract class Pet {
	protected String name;	//昵称
	protected int health;		//健康值
	protected int love;		//亲密度
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (health > 0) {
			this.health = health;
		}else{
			this.health = 0;
		}
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
	public Pet() {
	}
	
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	//打印
	public abstract void print();
	
	/**
	 * 宠物吃食
	 */
	public abstract void eat();
}
