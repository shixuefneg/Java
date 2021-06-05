package com.lening.Student;

import java.util.Scanner;

public class TestStuBiz {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//ʵ��������
		StudentBiz sbiz =new StudentBiz();
		//��ʼ������
		sbiz.initNames();
		boolean flag = true;  //�Ƿ�ѭ���ı��
		do{
			//��ʼ���˵�
			sbiz.initMenu();
			System.out.println("��ѡ��");
			int choice =input.nextInt();
			switch (choice) {
			case 1: //���ѧ������
				System.out.println("===============���ѧ������===============");
				System.out.println("������Ҫ��ӵ�ѧ������:");
				String name = input.next();
				//������ӵķ���
				sbiz.addName(name);
				System.out.println("=========================================");
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
			case 5://��ָ����Χ�ڲ��������Ƿ����	
				System.out.println("===========��ָ����Χ�ڲ��������Ƿ����============");
				System.out.println("������Ҫ���ҵ�����:");
				String findName = input.next();
				System.out.println("�����뿪ʼλ��:");
				int start  =input.nextInt();
				System.out.println("���������λ��:");
				int end  =input.nextInt();
				//���÷���
				boolean f3 = sbiz.findNameExists(start, end, findName);
				if (f3) {
					System.out.println("���ڣ�");
				}else{
					System.out.println("�����ڣ�");
				}
				break;
			case 6:	//�˳�
				System.out.println("�˳�");
				flag = false;
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}while (flag);
	}
}
