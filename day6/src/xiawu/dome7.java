package xiawu;

import java.util.Scanner;

/**
 * 
 * �����µ�һ�����飺 int[] nums = new int[]{100,80,200,40,24};������¹���:
(1)ѭ����������е�ÿһ��Ԫ��
(2)�������е����ݽ�������Ȼ���������֮��Ľ��
(3)�ֶ�����һ�����֣��鿴�������Ƿ����������������ڣ�����������ִ��ڣ�������ڣ���������ֲ����ڡ�
 *
 */
public class dome7 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//��������
	int[] nums = new int[]{100,80,200,40,24};
	
	int sum = 0;	//��
	//��������
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
		sum += nums[i];
	}
	System.out.println("��:"+sum);
	System.out.println("������һ����:");
	int a = input.nextInt();
	
	boolean f = false;	//���ִ��ڵı��
	//ѭ�������Ƿ���ָ�������ִ���
	for (int i = 0; i < nums.length; i++) {
		if (a==nums[i]) {
			f = true;
			break;
		}
	}
	
	if (f) {
		System.out.println("�������������д��ڣ�");
	}else{
		System.out.println("�������������в����ڣ�");
	}
}
}
