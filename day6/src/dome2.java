import java.util.Scanner;

public class dome2 {
	public static void main(String[] args) {
		double price[] = new double[5]; // ����
		double a[] = new double[5]; // ���յ���
		int xh = 0; // ���
		double sum = 0; // �ܽ��
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("�������" + (i + 1) + "�����");
			a[i] = sc.nextDouble();
			price[i] = a[i];
			// ����ÿ�ε���
			sum += a[i];
			// ��ÿ�ν��յ������
		}
		System.out.println();
		System.out.println("��ţ�" + "              " + "��Ԫ��");
		for (int i = 0; i < price.length; i++) {
			xh = i + 1;
			System.out.println(xh + "              " + price[i]);
		}
		System.out.println("\r\n�ܽ�Ԫ��                      " + sum);
	}
}
