/**
 * 抽象父类
 * @author shixuefeng
 *
 */
public abstract class Student {
	protected String name;
	protected int age;
	protected String sex;
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	//输出信息
	public abstract void print();
}
