import java.util.Scanner;


public class dome3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("������һ��ֵ:");
	int num=input.nextInt();
	
	for(int i=0,j=num;i<num;i++,j--){
		System.out.println(i+"+"+j+"="+(i+j));
	}
	
}
}
