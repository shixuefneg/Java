import java.util.Scanner;


public class zuoye4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个矩形的一个长和宽:");
		int chang = input.nextInt();
		int kuan = input.nextInt();
		int zhouchang = (chang+kuan)*2;
		int mianji = chang*kuan;
				System.out.println("矩形的周长是："+zhouchang);
				System.out.println("矩形的面积是："+mianji);
	}

}
