package DuoTai;

/**
 * ʨ����
 * @author KingWin
 *
 */
public class Lion extends Pet{
	
	private String color;	//ëɫ

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
		System.out.println("ʨ�ӵ��ڳ���֮ǰ�Ľ���ֵ��:"+health);
		System.out.println("ʨ�����ڳ���");
		setHealth(health+10);
		System.out.println("ʨ�ӳ������⣬����ֵ������10������ֵ��:"+health);
	}
}
