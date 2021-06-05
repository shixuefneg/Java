package test4;
/**
 *构造方法：
 * 1、构造方法没有返回值类型
 * 2、构造方法的方法名必须和类名一致
 * 3、构造方法可以有多个
 * 4、系统默认提供一个无参构造方法，
 * 但是当自己写了有参构造方法的时候，默认提供的无参构造方法将不在提供
 * 
 * 
 *  方法重载：（一同三不同）
 * 		发生在同一个类中
 * 一同： 方法名相同
 * 三不同：参数列表不同（参数个数不同、参数类型不同）
 * @author shixuefeng
 *
 */
public class Student {
	private String name;
	private	int age;
	private String sex;
	private	String address;
	
	public String gerName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(int age){
		return age;
	}
	
	public void setAge(int age){
		if(age >0 && age<200){
			this.age=age;
		}else{
			this.age=18;
		}
	}
	public Student(){
		
	}
	public Student(String name,int age,String sex,String address){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.address=address;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name+"\t"+age+"\t"+sex+"\t"+address);
	}
}
