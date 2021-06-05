package DuoTai;

public class Cat extends Pet{
	private String sex;		//�Ա�
	
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
	 * è����
	 */
	@Override
	public void eat() {
		System.out.println("è���ڳ���֮ǰ�Ľ���ֵ��:"+health);
		System.out.println("è���ڳ���");
		setHealth(health+5);
		System.out.println("è�������㣬����ֵ������5������ֵ��:"+health);
	}
	
	/**
	 * ������Ϸ
	 */
	public void catchBall(){
		System.out.println("è�����������Ϸ֮ǰ�����ܶ���:"+love);
		System.out.println("è�������������Ϸ");
		setLove(love+3);
		System.out.println("è���������Ϸ�����ܶ�������3������ֵ��:"+love);
	}
}
