package zuoye;

import java.util.Scanner;

/**
 *   *****			5��     
 *   *****
 *   *****			���ѭ�������������ڲ�ѭ������ÿ�е�*����
 *   *****
 *   *****
 */
public class z3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ӡͼ�ε�������");
		int rows = sc.nextInt();
		//������
		System.out.println("�����ǣ�");
		for (int i = 1; i <= rows; i++) {//��������
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		//������
		System.out.println("�����ǣ�");
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//�������εڶ��ַ���
		for (int i = 0; i <= rows; i++) {
        	for (int j = 1; j <= rows - i ; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
		System.out.println("--------------------------");
		//����������
		System.out.println("���������ǣ�");
		for (int i = 1; i <= rows; i++) {
        	//��ӡ�ո�
        	for (int j = 1; j <= rows - i ; j++) {
        		System.out.print(" ");
        	}
        	//��ӡ*
        	for (int j = 1; j <= 2 * i - 1; j++) {
        		System.out.print("*");
        	}
        	//����
        	System.out.println();
        }
		System.out.println("--------------------------");
		//������������
		System.out.println("���������ǣ�");
       for (int i = rows; i >= 0; i--)
		{
			for (int j = 0; j < rows - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}