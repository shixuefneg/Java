package xiawu;

import java.util.Scanner;

public class dome9 {
public static void main(String[] args) {
	String rank; // �û�����
    double money; // ������
    double discount; // �����ۿ�
    double pay; // ʵ�����
    Scanner sc = new Scanner(System.in);// ɨ����

    // ���벿��
    System.out.print("�����û��ǣ�y��/��(n)�ǻ�Ա��");
    rank = sc.next(); // �����ַ���
    System.out.print("���빺���");
    money = sc.nextDouble(); // ����ʵ��

    // ������
    if (rank.equals("��Ա")) { // �ж��Ƿ��ǻ�Ա
        if (money >= 200) {
        	System.out.println("�ǻ�Ա");
            discount = 0.75;
        } else {
            discount = 0.8;
        }
    } else {
        if (money >= 100) {
        	System.out.println("���ǻ�Ա");
            discount = 0.9;
        } else {
            discount = 1.0;
        }
    }
    pay = money * discount;

    // �������
    if (rank.equals("��Ա")) {
        System.out.println("��Ա�������" + discount * 10 + "�ۣ�ʵ����" + pay);
    } else {
        if (discount == 1.0) {
            System.out.println("�˿ͣ����ﲻ���ۣ�ʵ����" + pay);
        } else {
            System.out.println("�˿ͣ������" + discount * 10 + "�ۣ�ʵ����" + pay);
        }
    }
}
}
