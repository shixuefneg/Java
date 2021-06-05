package com.test1;

public class Test {
public static void main(String[] args) {
	StudentBiz sbiz =new StudentBiz();
	//初始化数据
	sbiz.init();
	//遍历数组
	sbiz.show();
	//添加学生信息
	Student stu =new Student("赵烈","女",28,"河北张家口");
	sbiz.addStu(stu);
	//遍历数组
	sbiz.show();
	//最大年龄学生对象
	sbiz.getMaxAge();
	//删除
	boolean f= sbiz.delStuName("张散");
	if(f){
		System.out.println("删除成功");
	}else{
		System.out.println("该学生不存在，删除失败！");
	}
	sbiz.show();
	//修改张三的年龄
	sbiz.updateStu("张三", 30);
	//平均年龄
	sbiz.getAvgAge();
}
}
