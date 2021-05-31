import java.util.Scanner;


public class zuoye3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a =input.nextInt() ;
		switch (a) {
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
			System.out.println("7-9月份为秋季季");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("10-12月份为冬季");
			break;
		
		}
	
	}
}
