import java.util.Scanner;


public class dome1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//创建数组
	int[] nums = new int[]{8,4,2,1,233,344,12};
	
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
