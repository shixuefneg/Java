package com.lening.Student;

import java.util.Scanner;

public class TestStuBiz {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//实例化对象
		StudentBiz sbiz =new StudentBiz();
		//初始化数据
		sbiz.initNames();
		boolean flag = true;  //是否循环的标记
		do{
			//初始化菜单
			sbiz.initMenu();
			System.out.println("请选择：");
			int choice =input.nextInt();
			switch (choice) {
			case 1: //添加学生姓名
				System.out.println("===============添加学生姓名===============");
				System.out.println("请输入要添加的学生姓名:");
				String name = input.next();
				//调用添加的方法
				sbiz.addName(name);
				System.out.println("=========================================");
				break;
			case 2:	//查询所有学生姓名
				sbiz.showName();
				break;
			case 3:	//删除学生姓名
				System.out.println("===================删除学生姓名===================");
				System.out.println("请输入要删除的学生姓名:");
				String delName = input.next();
				boolean f = sbiz.delName(delName);
				if (f) {
					System.out.println("删除成功！");
				}else{
					System.out.println("删除失败！");
				}
				//调用查询方法
				sbiz.showName();
				break;	
			case 4:	//修改学生姓名
				System.out.println("==============修改学生姓名===============");
				System.out.println("请输入修改之前的学生姓名：");
				String oldName = input.next();
				System.out.println("请输入修改之后的学生姓名：");
				String newName = input.next();
				//调用修改的方法
				boolean f2 = sbiz.updateName(oldName, newName);
				if (f2) {
					System.out.println("修改成功！");
				}else{
					System.out.println("修改失败！");
				}
				//查询
				sbiz.showName();
				break;
			case 5://在指定范围内查找名字是否存在	
				System.out.println("===========在指定范围内查找名字是否存在============");
				System.out.println("请输入要查找的姓名:");
				String findName = input.next();
				System.out.println("请输入开始位置:");
				int start  =input.nextInt();
				System.out.println("请输入结束位置:");
				int end  =input.nextInt();
				//调用方法
				boolean f3 = sbiz.findNameExists(start, end, findName);
				if (f3) {
					System.out.println("存在！");
				}else{
					System.out.println("不存在！");
				}
				break;
			case 6:	//退出
				System.out.println("退出");
				flag = false;
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}while (flag);
	}
}
