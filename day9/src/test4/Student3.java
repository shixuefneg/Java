package test4;

public class Student3 {
	private String name; //����
	private int age;	//����
	private String sex;//�Ա�
	private String address;//����
	
	//����
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	//����
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
	//�Ա�
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex =sex;
	}
	//����
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address =address;
	}

	
	
	//�޲�
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�в�
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
