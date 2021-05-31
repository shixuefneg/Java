import java.util.Scanner;


public class dome2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("请输入长和宽:");
		int cara = input.nextInt();
		int baa = input.nextInt();
		int mianji = cara*baa;
		int zhouchang = (cara+baa)*2;
		System.out.println("面积是:"+mianji);
		System.out.println("周长是："+zhouchang);
	}
}
