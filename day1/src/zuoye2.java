import java.util.Scanner;


public class zuoye2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����ɨ����
		Scanner input = new Scanner(System.in);
		System.out.println("������Java�ɼ���");
		int javaScore = input.nextInt();
		System.out.println("������stb�ɼ���");
		int stbScore = input.nextInt();
		System.out.println("������sql�ɼ���");
		int sqlScore = input.nextInt();
		
		int sum = javaScore+stbScore+sqlScore;
		int car = sum/3;
		int java = javaScore-sqlScore;
		System.out.println("��:"+sum);
		System.out.println("ƽ����:"+car);
		System.out.println("�"+java);
	}

}
