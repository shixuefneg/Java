package com.test1;

public class Test {
public static void main(String[] args) {
	StudentBiz sbiz =new StudentBiz();
	//��ʼ������
	sbiz.init();
	//��������
	sbiz.show();
	//���ѧ����Ϣ
	Student stu =new Student("����","Ů",28,"�ӱ��żҿ�");
	sbiz.addStu(stu);
	//��������
	sbiz.show();
	//�������ѧ������
	sbiz.getMaxAge();
	//ɾ��
	boolean f= sbiz.delStuName("��ɢ");
	if(f){
		System.out.println("ɾ���ɹ�");
	}else{
		System.out.println("��ѧ�������ڣ�ɾ��ʧ�ܣ�");
	}
	sbiz.show();
	//�޸�����������
	sbiz.updateStu("����", 30);
	//ƽ������
	sbiz.getAvgAge();
}
}
