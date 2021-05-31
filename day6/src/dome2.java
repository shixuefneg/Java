import java.util.Scanner;

public class dome2 {
	public static void main(String[] args) {
		double price[] = new double[5]; // 单价
		double a[] = new double[5]; // 接收单价
		int xh = 0; // 序号
		double sum = 0; // 总金额
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入第" + (i + 1) + "购物金额：");
			a[i] = sc.nextDouble();
			price[i] = a[i];
			// 接收每次单价
			sum += a[i];
			// 把每次接收单价相加
		}
		System.out.println();
		System.out.println("序号：" + "              " + "金额（元）");
		for (int i = 0; i < price.length; i++) {
			xh = i + 1;
			System.out.println(xh + "              " + price[i]);
		}
		System.out.println("\r\n总金额（元）                      " + sum);
	}
}
