import java.util.Scanner;


public class zuoye4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("����һ�����ε�һ�����Ϳ�:");
		int chang = input.nextInt();
		int kuan = input.nextInt();
		int zhouchang = (chang+kuan)*2;
		int mianji = chang*kuan;
				System.out.println("���ε��ܳ��ǣ�"+zhouchang);
				System.out.println("���ε�����ǣ�"+mianji);
	}

}
