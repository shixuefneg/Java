package test7;

/**
 * ����
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
	}
	
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
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
	
}
