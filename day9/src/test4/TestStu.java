package test4;

/**
 * 构造方法的作用：
 * 		创建对象，并且初始化对象属性信息
 * @author KingWin
 *
 */
public class TestStu {
	public static void main(String[] args) {
		//创建学生对象
		//new 对象的时候会调用构造方法
		Student stu = new Student();
		stu.show();
		Student stu2 = new Student("李四", 2000, "男", "北京市昌平区");
		//属性可以被随意访问，并且可以不合理赋值
		stu2.setAge(20);
		
		stu2.show();
	}
}
