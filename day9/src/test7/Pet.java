package test7;

public class Pet {
	protected String name;	//êÇ³Æ
	protected int health;		//½¡¿µÖµ
	protected int love;		//Ç×ÃÜ¶È
	
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
		this.health = health;
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
	
}
