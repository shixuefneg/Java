import java.util.Scanner;


public class zuoye3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输底和高：");
		int di = input.nextInt();
	
		int gao = input.nextInt();
		
		int mianji = di*gao/2;
		System.out.println("面积是"+mianji);
	}

}
