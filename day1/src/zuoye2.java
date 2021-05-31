import java.util.Scanner;


public class zuoye2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建扫描器
		Scanner input = new Scanner(System.in);
		System.out.println("请输入Java成绩：");
		int javaScore = input.nextInt();
		System.out.println("请输入stb成绩：");
		int stbScore = input.nextInt();
		System.out.println("请输入sql成绩：");
		int sqlScore = input.nextInt();
		
		int sum = javaScore+stbScore+sqlScore;
		int car = sum/3;
		int java = javaScore-sqlScore;
		System.out.println("和:"+sum);
		System.out.println("平均分:"+car);
		System.out.println("差："+java);
	}

}
