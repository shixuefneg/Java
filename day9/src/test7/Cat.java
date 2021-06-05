package test7;
/**
 * √®¿‡
 */
public class Cat extends Pet{
	private String sex;		
	
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
}
