import java.util.Scanner;

public class zuouye1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩：");
		int score = sc.nextInt();
		if(score>=80){
			System.out.println("奖励一个篮球");
		}else{
			System.out.println("奖励一本练习册");
			}
		}
}
