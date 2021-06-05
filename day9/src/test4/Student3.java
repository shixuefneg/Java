package test4;

public class Student3 {
	private String name; //名字
	private int age;	//年龄
	private String sex;//性别
	private String address;//地区
	
	//名字
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	//年龄
	public int getAge(){
		return age;
	}
	
	public void srtAge(int age){
		if(age>0&&age<200){
			this.age=age;
		}else{
			this.age=18;
		}
		
	}
	//性别
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex =sex;
	}
	//地区
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address =address;
	}

	
	
	//无参
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参
	public Student3(String name, int age, String sex, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
	public void show(){
		System.out.println(name+"\t"+age+"\t"+sex+"\t"+address);
	}
	
}
