package DuoTai;

/**
 * 狮子类
 * @author KingWin
 *
 */
public class Lion extends Pet{
	
	private String color;	//毛色

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String name, int health, int love, String color) {
		super(name, health, love);
		this.color = color;
	}

	@Override
	public void print() {
		System.out.println(name+"\t"+health+"\t"+love+"\t"+color);
	}

	@Override
	public void eat() {
		System.out.println("狮子的在吃肉之前的健康值是:"+health);
		System.out.println("狮子正在吃肉");
		setHealth(health+10);
		System.out.println("狮子吃完了肉，健康值增加了10，现在值是:"+health);
	}
}
