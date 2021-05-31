package xiawu;

import java.util.Scanner;

public class dome1 {
public static void main(String[] args) {
	System.out.println("输入一个[0-100]之间的分数");
	Scanner  sc=new Scanner(System.in);
	
	int cj=sc.nextInt();
	if(cj>100){
		System.out.println("你输入的数据不在有效的范围");
	}
	else if(cj>=90){
		System.out.println("A");
	}else if(cj>=80)
	{
		System.out.println("B");
	}	
	else if(cj>=70)
	{
		System.out.println("C");
	}	
	else if(cj>=60)
	{
		System.out.println("D");
	}	
	else if(cj<60)
	{
		System.out.println("E");
	}	
}
}
