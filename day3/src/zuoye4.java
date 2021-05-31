import java.util.Scanner;


public class zuoye4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cj= sc.nextInt();	
		if(cj>=90&cj<=100){
		System.out.println("您的成绩是优秀");
		}else if(cj>=80){
		System.out.println("您的成绩是优良");
		}else if(cj>=70){
		System.out.println("您的成绩是良好");
		}else if(cj>=60){
		System.out.println("及格");
		}else{
		System.out.println("不及格");
		}
	}
	}

