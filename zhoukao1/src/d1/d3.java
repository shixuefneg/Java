package d1;

import java.util.Scanner;

//��ʹ��switch���⣩һ����12���£�1-3�·�Ϊ������4-6�·�Ϊ�ļ���7-9�·�Ϊ�＾��10-12�·�Ϊ��������������һ���·ݣ�Ҫ���ܹ���ʾ���·���ʲô���ڡ�
public class d3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("�������·ݣ�");
	int i=sc.nextInt();
	switch (i) {
	case 1:
	case 2:
	case 3:
		System.out.println("1-3�·�Ϊ����");
		break;
	case 4:
	case 5:
	case 6:
		System.out.println("4-6�·�Ϊ�ļ�");
		break;
	case 7:
	case 8:
	case 9:
		System.out.println("7-9�·�Ϊ�＾");
	case 10:
	case 11:
	case 12:
		System.out.println("10-12�·�Ϊ����");
	}
}
}
