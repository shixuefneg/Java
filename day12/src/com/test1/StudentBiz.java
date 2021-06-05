	package com.test1;

import javax.jws.soap.SOAPBinding.Style;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class StudentBiz {

	//初始化学生对象数组
	Student[] stus = new Student[5];
	/*
	*初始化数组信息 
	*/
	public void init(){
		Student stu1 = new Student("张三","男",20,"北京市昌平区");
		Student stu2 = new Student("李四","男",21,"北京市朝阳区");
		Student stu3 = new Student("王五","男",22,"北京市丰台区");
		
	
	
	//添加到数组中
	stus[0]= stu1;
	stus[1]= stu2;
	stus[2]= stu3;
	}
	
	/*
	 * 循环遍历数组信息
	 */
	public void show(){
		System.out.println("===========遍历循环信息================");
		boolean flag=false;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				flag=true;
				Student stu = stus[i];
				System.out.println(stu.toString());
			}
		}
		if(!flag){
			System.out.println("对不起，数组内没有数据");
			
		}
		System.out.println("==================================");
	}
	/*
	 * 添加学生信息
	 */
	public void addStu(Student stu){
		System.out.println("==============添加学生信息==================");
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]==null){
				stus[i]=stu;
				System.out.println("添加成功");
				break;
			}
		}
		System.out.println("========================================");
	}
	/*
	 * 求数组当中，年龄最大的学生的学生信息
	 */
	public void getMaxAge() {
		Student maxStu = stus[0];
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				Student stu = stus[i];
				//每一个学生的年龄
				int age =stu.getAge();
				//最大的学生年龄
				int maxAge = maxStu.getAge();
				if(age>maxAge){
					maxStu =stu;
				}
			}
			
		}
		System.out.println("年龄最大的学生信息是:");
		System.out.println(maxStu.toString());
	}
	//删除数组内信息
	public boolean delStuName(String delName){
		boolean f=false;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				//获取每个学生姓名
				String name = stus[i].getName();
				if(delName.equals(name)){
					//删除
					stus[i]=null;
					f=true;
				}
			}
		}
		return false;
		
	}
	//修改学生年龄
	public void updateStu(String stuname,int age){
		boolean f= false;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]!=null){
				//获取每个学生对象
				Student stu =stus[i];
				//获取每一个学生对象的姓名
				String name =stu.getName();
				if(stuname.equals(name)){
					//修改年龄
					stu.setAge(age);
					f=true;
					break;
				}
			}
			
		}
		if(f){
			System.out.println("修改成功！");
			
		}else{
			System.out.println("该学生不存在，修改失败！");
		}
		//遍历学生信息
		show();
	}
	//求平均年龄 先获取每个学生的年龄，然后求和
	public void  getAvgAge() {
		System.out.println("==================获取平均年龄=====================");
		int sum =0;
		int count =0;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {
				//先获取到每个学生对象
				Student stu = stus[i];
				//获取每个学生的年龄
				sum += stu.getAge();
				count++;
			}
		}
		double avg = (double)sum / count;
		System.out.println("平均年龄是:"+avg);
		System.out.println("==================================================");
	}
	
	
}
