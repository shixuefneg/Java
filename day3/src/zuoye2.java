import java.util.Scanner;


public class zuoye2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("语文成绩是：");
		int s1= sc.nextInt();
		System.out.println("数学成绩是：");
		int s2= sc.nextInt();
		if(s1++>=90&s2++>=98){
			System.out.println("可以参加训练营");
		}else {
			System.out.println("不可以参加训练营");
		}
			
	}
}
