import java.util.Scanner;

public class dome2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name = input.next();
		int sumScore = 0;
		boolean flag = true;
		for (int i = 1; i <= 5; i++) {
			System.out.println("�������" + i + "�ſγ̵ĳɼ�");
			int score = input.nextInt();
			if (score < 0) {
			
				System.out.println("¼�����");
				flag=false;
				break;
			}
			sumScore += score;
		}
		if (flag) {
			double avg = (double) sumScore / 5;
			System.out.println(name + "��ƽ������:" + avg);
		}

	}
}
