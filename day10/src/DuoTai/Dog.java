package DuoTai;

/**
 * ����
 * @author KingWin
 *
 */
public class Dog extends Pet{
	private String strain;	//Ʒ��
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public Dog() {
		System.out.println("������޲ι��췽��");
	}
	
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
		System.out.println("������вι��췽��");
		
	}
	
	public void show(String name){
		//super  ����Ķ���
		//this   ��ǰ��Ķ���
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
	 * ���Թ���
	 */
	@Override
	public void eat() {
		System.out.println("�����ڳԹ���֮ǰ�Ľ���ֵ��:"+health);
		System.out.println("�����ڳԹ���");
		setHealth(health+3);
		System.out.println("�������˹���������ֵ������3������ֵ��:"+health);
	}
	
	/**
	 * �ӷ�����Ϸ
	 */
	public void catchFlyingDisc(){
		System.out.println("��������ӷ�����Ϸ֮ǰ�����ܶ���:"+love);
		System.out.println("����������ӷ�����Ϸ");
		setLove(love+4);
		System.out.println("�����������Ϸ�����ܶ�������4������ֵ��:"+love);
	}
}
