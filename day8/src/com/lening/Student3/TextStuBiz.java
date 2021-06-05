package com.lening.Student3;

import java.util.Scanner;

import com.lening.Student.StudentBiz;

public class TextStuBiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ʵ��������
		StudentBiz sbiz = new StudentBiz();
		//��ʼ������
		sbiz.initNames();
		boolean flag = true;	//�Ƿ�ѭ���ı��
		do {
			//��ʼ���˵�
			sbiz.initMenu();
			System.out.println("��ѡ��");
			int choice = input.nextInt();
			switch (choice) {
				case 1:	//���ѧ������
					System.out.println("===============���ѧ������===============");
					System.out.println("������Ҫ��ӵ�ѧ������:");
					String name = input.next();
					//������ӵķ���
					sbiz.addName(name);
					
					break;
				case 2:	//��ѯ����ѧ������
					sbiz.showName();
					break;
				case 3:	//ɾ��ѧ������
					System.out.println("===================ɾ��ѧ������===================");
					System.out.println("������Ҫɾ����ѧ������:");
					String delName = input.next();
					boolean f = sbiz.delName(delName);
					if (f) {
						System.out.println("ɾ���ɹ���");
					}else{
						System.out.println("ɾ��ʧ�ܣ�");
					}
					//���ò�ѯ����
					sbiz.showName();
					break;
				case 4:	//�޸�ѧ������
					System.out.println("==============�޸�ѧ������===============");
					System.out.println("�������޸�֮ǰ��ѧ��������");
					String oldName = input.next();
					System.out.println("�������޸�֮���ѧ��������");
					String newName = input.next();
					//�����޸ĵķ���
					boolean f2 = sbiz.updateName(oldName, newName);
					if (f2) {
						System.out.println("�޸ĳɹ���");
					}else{
						System.out.println("�޸�ʧ�ܣ�");
					}
					//��ѯ
					sbiz.showName();
					break;
				case 5:	//�˳�
					System.out.println("�˳�");
					flag = false;
					break;
				default:
					System.out.println("����������������룡");
					break;
			}
		} while (flag);
	}
}
