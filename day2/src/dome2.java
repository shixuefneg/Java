import java.util.Scanner;


public class dome2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("�����볤�Ϳ�:");
		int cara = input.nextInt();
		int baa = input.nextInt();
		int mianji = cara*baa;
		int zhouchang = (cara+baa)*2;
		System.out.println("�����:"+mianji);
		System.out.println("�ܳ��ǣ�"+zhouchang);
	}
}
