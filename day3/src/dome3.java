import java.util.Scanner;

//判断
public class dome3 {
	public static void main(String[] args) {
		int liSi = 80;
		boolean isBig;
		
		Scanner input =new Scanner(System.in);
		System.out.println("输入学员张三的成绩：");
		int zhangSan = input.nextInt();
		 
		isBig = zhangSan > liSi;
		System.out.println("张三的成绩比李四高吗？"+isBig);
	}
}
