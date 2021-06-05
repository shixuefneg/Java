package test4;

public class TestStu2 {
	public static void main(String[] args) {
		//创建学生对象
				//new 对象的时候会调用构造方法
				Student stu = new Student();
				stu.show();
				Student stu2 = new Student("李四", 2000, "男", "北京市昌平区");
				//属性可以被随意访问，并且可以不合理赋值
				stu2.setAge(20);
				System.out.println(stu2.getAge(0));
				stu2.show();
	}
}
