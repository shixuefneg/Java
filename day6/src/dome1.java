import java.util.Scanner;


public class dome1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//��������
	int[] nums = new int[]{8,4,2,1,233,344,12};
	
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
