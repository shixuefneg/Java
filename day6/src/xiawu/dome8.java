package xiawu;

import java.util.Scanner;

//8�����4�ҵ�����ֻ��۸�
public class dome8 {
public static void main(String[] args) {
	int[] price = new int[4];		
	Scanner input = new Scanner(System.in);
	for (int k = 0; k < price.length; k++) {
		System.out.println("�������" + (k + 1) + "���ֻ���ļ۸�");
		price[k] = input.nextInt();
	}
	int min = price[0];//���跨:������С��Ǯ���������еĵ�һ����
	//��min��[]���αȽ�
	for (int i = 1; i < price.length ; i++) {//���������ɵ���������λ���鳤��
	if (min > price[i]) {
	min = price[i];
	}
	}
	System.out.println("��ͼ۸���:" + min);
}
}
