import java.util.Scanner;

public class dome2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name = input.next();
		int sumScore = 0;
		boolean flag = true;
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "门课程的成绩");
			int score = input.nextInt();
			if (score < 0) {
			
				System.out.println("录入错误");
				flag=false;
				break;
			}
			sumScore += score;
		}
		if (flag) {
			double avg = (double) sumScore / 5;
			System.out.println(name + "的平均分是:" + avg);
		}

	}
}
