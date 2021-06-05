package com.lening.Student;
/*
 实现对学生姓名的增删改查的操作类

 * */
public class StudentBiz {
	//姓名数组
	
	String[] names=new String[30];
	//初始化姓名数组的数据
	public void initNames(){
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "赵六";
		names[4] = "田七";
	}
	//初始化菜单
	public void initMenu(){
		System.out.println("============学生姓名管理系统=============");
		System.out.println("\t1.添加学生姓名");
		System.out.println("\t2.查询所有学生姓名");
		System.out.println("\t3.删除学生姓名");
		System.out.println("\t4.修改学生姓名");
		System.out.println("\t5.在指定范围内查找名字是否存在");
		System.out.println("\t6.退出");
		System.out.println("========================================");
	}
	//添加学生姓名
	public void addName(String name){
		for(int i=0;i<name.length();i++){
			//判断第一个没有名字的位置
			if(names[i]==null){
				//将名字添加在该下标的位子
				names[i]=name;
				break;
			}
		}
	}
	//遍历数组信息
	public void showName(){
		System.out.println("===========遍历数组信息=============");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.println(names[i]+"\t");
				if((i+1)%5==0){
					//换行
					System.out.println();
				}
			}
		}
		System.out.println("\n===================================");
		
	}
	//删除学生姓名
	public boolean delName(String delName){
		boolean flag = false;
		for(int i=0;i<names.length;i++){
			if(delName.equals(names[i])){
				//要删除的名字存在，可以删除
				flag=true;
				names[i]=null;
			}
		}
		return flag;
	}
	//修改学生姓名
	public boolean updateName(String oldName,String newName){
		/*1、先查询原始姓名是否存在
		 * 2、如果存在，则修改----赋值
		 * 如果不存在，则提示修改失败
		 * **/
		boolean flag = false;
		for(int i =0;i<names.length;i++){
			if(oldName.equals(names[i])){
				//注意：不要null指针异常
				flag=true;
				//存在，则修改该下标位置的值
				names[i]=newName;
			}
		}
		return flag;
	}
	/**
	 * 在某个区间内查找指定姓名是否存在
	 * @param start	开始位置
	 * @param end	结束位置
	 * @param name	要查找的姓名
	 * @return 是否存在
	 */
	public boolean findNameExists(int start,int end,String name){
		boolean flag = false;
		for (int i = start; i <= end; i++) {
			if (name.equals(names[i])) {
				flag = true;
			}
		}
		return flag;
	}
}

