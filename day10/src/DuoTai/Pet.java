package DuoTai;

/**
 * �����ࣨ���ࣩ
 * @author KingWin
 *	abstract ������
 *	1�������಻�ܱ�ʵ����
 */
public abstract class Pet {
	protected String name;	//�ǳ�
	protected int health;		//����ֵ
	protected int love;		//���ܶ�
	
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
	//��ӡ
	public abstract void print();
	
	/**
	 * �����ʳ
	 */
	public abstract void eat();
}
