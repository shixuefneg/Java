package test4;

public class TestStu2 {
	public static void main(String[] args) {
		//����ѧ������
				//new �����ʱ�����ù��췽��
				Student stu = new Student();
				stu.show();
				Student stu2 = new Student("����", 2000, "��", "�����в�ƽ��");
				//���Կ��Ա�������ʣ����ҿ��Բ�����ֵ
				stu2.setAge(20);
				System.out.println(stu2.getAge(0));
				stu2.show();
	}
}
