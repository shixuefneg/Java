import java.util.Scanner;

//�ж�
public class dome3 {
	public static void main(String[] args) {
		int liSi = 80;
		boolean isBig;
		
		Scanner input =new Scanner(System.in);
		System.out.println("����ѧԱ�����ĳɼ���");
		int zhangSan = input.nextInt();
		 
		isBig = zhangSan > liSi;
		System.out.println("�����ĳɼ������ĸ���"+isBig);
	}
}
