package test7;

/**
 * 狗类
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
	}
	
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
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
	
}
