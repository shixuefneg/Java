package xiawu;

import java.util.Scanner;

public class dome1 {
public static void main(String[] args) {
	System.out.println("����һ��[0-100]֮��ķ���");
	Scanner  sc=new Scanner(System.in);
	
	int cj=sc.nextInt();
	if(cj>100){
		System.out.println("����������ݲ�����Ч�ķ�Χ");
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
