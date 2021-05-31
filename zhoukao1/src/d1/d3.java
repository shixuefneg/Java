package d1;

import java.util.Scanner;

//（使用switch做题）一年有12个月，1-3月份为春季，4-6月份为夏季，7-9月份为秋季，10-12月份为冬季。现在输入一个月份，要求能够显示该月份是什么季节。
public class d3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入月份：");
	int i=sc.nextInt();
	switch (i) {
	case 1:
	case 2:
	case 3:
		System.out.println("1-3月份为春季");
		break;
	case 4:
	case 5:
	case 6:
		System.out.println("4-6月份为夏季");
		break;
	case 7:
	case 8:
	case 9:
		System.out.println("7-9月份为秋季");
	case 10:
	case 11:
	case 12:
		System.out.println("10-12月份为冬季");
	}
}
}
