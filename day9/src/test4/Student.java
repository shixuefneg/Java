package test4;
/**
 *���췽����
 * 1�����췽��û�з���ֵ����
 * 2�����췽���ķ��������������һ��
 * 3�����췽�������ж��
 * 4��ϵͳĬ���ṩһ���޲ι��췽����
 * ���ǵ��Լ�д���вι��췽����ʱ��Ĭ���ṩ���޲ι��췽���������ṩ
 * 
 * 
 *  �������أ���һͬ����ͬ��
 * 		������ͬһ������
 * һͬ�� ��������ͬ
 * ����ͬ�������б�ͬ������������ͬ���������Ͳ�ͬ��
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
