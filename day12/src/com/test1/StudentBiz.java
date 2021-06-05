	package com.test1;

import javax.jws.soap.SOAPBinding.Style;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class StudentBiz {

	//��ʼ��ѧ����������
	Student[] stus = new Student[5];
	/*
	*��ʼ��������Ϣ 
	*/
	public void init(){
		Student stu1 = new Student("����","��",20,"�����в�ƽ��");
		Student stu2 = new Student("����","��",21,"�����г�����");
		Student stu3 = new Student("����","��",22,"�����з�̨��");
		
	
	
	//��ӵ�������
	stus[0]= stu1;
	stus[1]= stu2;
	stus[2]= stu3;
	}
	
	/*
	 * ѭ������������Ϣ
	 */
	public void show(){
		System.out.println("===========����ѭ����Ϣ================");
		boolean flag=false;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				flag=true;
				Student stu = stus[i];
				System.out.println(stu.toString());
			}
		}
		if(!flag){
			System.out.println("�Բ���������û������");
			
		}
		System.out.println("==================================");
	}
	/*
	 * ���ѧ����Ϣ
	 */
	public void addStu(Student stu){
		System.out.println("==============���ѧ����Ϣ==================");
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]==null){
				stus[i]=stu;
				System.out.println("��ӳɹ�");
				break;
			}
		}
		System.out.println("========================================");
	}
	/*
	 * �����鵱�У���������ѧ����ѧ����Ϣ
	 */
	public void getMaxAge() {
		Student maxStu = stus[0];
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				Student stu = stus[i];
				//ÿһ��ѧ��������
				int age =stu.getAge();
				//����ѧ������
				int maxAge = maxStu.getAge();
				if(age>maxAge){
					maxStu =stu;
				}
			}
			
		}
		System.out.println("��������ѧ����Ϣ��:");
		System.out.println(maxStu.toString());
	}
	//ɾ����������Ϣ
	public boolean delStuName(String delName){
		boolean f=false;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				//��ȡÿ��ѧ������
				String name = stus[i].getName();
				if(delName.equals(name)){
					//ɾ��
					stus[i]=null;
					f=true;
				}
			}
		}
		return false;
		
	}
	//�޸�ѧ������
	public void updateStu(String stuname,int age){
		boolean f= false;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				//��ȡÿ��ѧ������
				Student stu =stus[i];
				//��ȡÿһ��ѧ�����������
				String name =stu.getName();
				if(stuname.equals(name)){
					//�޸�����
					stu.setAge(age);
					f=true;
					break;
				}
			}
			
		}
		if(f){
			System.out.println("�޸ĳɹ���");
			
		}else{
			System.out.println("��ѧ�������ڣ��޸�ʧ�ܣ�");
		}
		//����ѧ����Ϣ
		show();
	}
	//��ƽ������ �Ȼ�ȡÿ��ѧ�������䣬Ȼ�����
	public void  getAvgAge() {
		System.out.println("==================��ȡƽ������=====================");
		int sum =0;
		int count =0;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {
				//�Ȼ�ȡ��ÿ��ѧ������
				Student stu = stus[i];
				//��ȡÿ��ѧ��������
				sum += stu.getAge();
				count++;
			}
		}
		double avg = (double)sum / count;
		System.out.println("ƽ��������:"+avg);
		System.out.println("==================================================");
	}
	
	
}
