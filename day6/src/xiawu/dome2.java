package xiawu;
//ʵ�ֵ�½���ܣ�����û������롰tom�������롰123������ʾ��½�ɹ���������ʾ����������������룡������XX�λ��ᡣ �����������󽫲����������룬����ʾ�Բ�������˺Ž���������
import java.util.Scanner;

public class dome2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	    System.out.println("�������û�����");
	    String username = sc.nextLine();
	    System.out.println("���������룺");
	    String password = sc.nextLine();
	    int i = 3;
       
        do {
        	System.out.println("�������û�����");
            System.out.println("����������");
            String s = sc.nextLine();
            if (s.equals("123")) {
                break;
            } else {
                System.out.println("��ʣ��" + --i + "�λ���");
            }
        } while (i > 0);
    }
}

	 
   
