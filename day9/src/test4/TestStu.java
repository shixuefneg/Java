package test4;

/**
 * ���췽�������ã�
 * 		�������󣬲��ҳ�ʼ������������Ϣ
 * @author KingWin
 *
 */
public class TestStu {
	public static void main(String[] args) {
		//����ѧ������
		//new �����ʱ�����ù��췽��
		Student stu = new Student();
		stu.show();
		Student stu2 = new Student("����", 2000, "��", "�����в�ƽ��");
		//���Կ��Ա�������ʣ����ҿ��Բ�����ֵ
		stu2.setAge(20);
		
		stu2.show();
	}
}
