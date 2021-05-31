package zuoye;

import java.util.Scanner;

/**
 *   *****			5行     
 *   *****
 *   *****			外层循环控制行数，内层循环控制每行的*个数
 *   *****
 *   *****
 */
public class z3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要打印图形的行数：");
		int rows = sc.nextInt();
		//正三角
		System.out.println("正三角：");
		for (int i = 1; i <= rows; i++) {//控制行数
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		//倒三角
		System.out.println("倒三角：");
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//倒三角形第二种方法
		for (int i = 0; i <= rows; i++) {
        	for (int j = 1; j <= rows - i ; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
		System.out.println("--------------------------");
		//等腰三角形
		System.out.println("正等腰三角：");
		for (int i = 1; i <= rows; i++) {
        	//打印空格
        	for (int j = 1; j <= rows - i ; j++) {
        		System.out.print(" ");
        	}
        	//打印*
        	for (int j = 1; j <= 2 * i - 1; j++) {
        		System.out.print("*");
        	}
        	//换行
        	System.out.println();
        }
		System.out.println("--------------------------");
		//倒等腰三角形
		System.out.println("倒等腰三角：");
       for (int i = rows; i >= 0; i--)
		{
			for (int j = 0; j < rows - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}