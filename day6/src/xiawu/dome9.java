package xiawu;

import java.util.Scanner;

public class dome9 {
public static void main(String[] args) {
	String rank; // 用户级别
    double money; // 购物金额
    double discount; // 购物折扣
    double pay; // 实付金额
    Scanner sc = new Scanner(System.in);// 扫描器

    // 输入部分
    System.out.print("输入用户是（y）/否(n)是会员：");
    rank = sc.next(); // 接收字符串
    System.out.print("输入购物金额：");
    money = sc.nextDouble(); // 接收实数

    // 处理部分
    if (rank.equals("会员")) { // 判断是否是会员
        if (money >= 200) {
        	System.out.println("是会员");
            discount = 0.75;
        } else {
            discount = 0.8;
        }
    } else {
        if (money >= 100) {
        	System.out.println("不是会员");
            discount = 0.9;
        } else {
            discount = 1.0;
        }
    }
    pay = money * discount;

    // 输出部分
    if (rank.equals("会员")) {
        System.out.println("会员：购物打" + discount * 10 + "折，实付金额：" + pay);
    } else {
        if (discount == 1.0) {
            System.out.println("顾客：购物不打折，实付金额：" + pay);
        } else {
            System.out.println("顾客：购物打" + discount * 10 + "折，实付金额：" + pay);
        }
    }
}
}
