package xiawu;

import java.util.Scanner;

/**
 * 
 * 有如下的一个数组： int[] nums = new int[]{100,80,200,40,24};完成如下功能:
(1)循环输出数组中的每一个元素
(2)对数组中的数据进行排序，然后输出排序之后的结果
(3)手动输入一个数字，查看数组中是否含有这个数，如果存在，则输出该数字存在，如果不在，输出该数字不存在。
 *
 */
public class dome7 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//创建数组
	int[] nums = new int[]{100,80,200,40,24};
	
	int sum = 0;	//和
	//遍历数组
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
		sum += nums[i];
	}
	System.out.println("和:"+sum);
	System.out.println("请输入一个数:");
	int a = input.nextInt();
	
	boolean f = false;	//数字存在的标记
	//循环查找是否有指定的数字存在
	for (int i = 0; i < nums.length; i++) {
		if (a==nums[i]) {
			f = true;
			break;
		}
	}
	
	if (f) {
		System.out.println("该数字在数组中存在！");
	}else{
		System.out.println("该数字在数组中不存在！");
	}
}
}
