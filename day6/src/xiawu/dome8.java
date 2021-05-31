package xiawu;

import java.util.Scanner;

//8、求出4家店最低手机价格
public class dome8 {
public static void main(String[] args) {
	int[] price = new int[4];		
	Scanner input = new Scanner(System.in);
	for (int k = 0; k < price.length; k++) {
		System.out.println("请输入第" + (k + 1) + "家手机店的价格");
		price[k] = input.nextInt();
	}
	int min = price[0];//假设法:假设最小的钱数是数组中的第一个数
	//将min和[]依次比较
	for (int i = 1; i < price.length ; i++) {//这个根据题干的需求来定位数组长度
	if (min > price[i]) {
	min = price[i];
	}
	}
	System.out.println("最低价格是:" + min);
}
}
