package xiawu;

import java.util.Scanner;

public class dome10 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("�������һ����:");
	  int firstNum = in.nextInt(); 
	  System.out.println("����������������ţ�");      
	  String s = in.next();      
	  System.out.println("������ڶ������֣�");    
	  int secondNum = in.nextInt();      
	  switch(s){      
	  case "+":    
		  System.out.println(firstNum + "+" +secondNum+"="+(firstNum+secondNum));   
		  break;
		  
		  
		  case "-":      
		System.out.println(firstNum+"-"+secondNum+"="+(firstNum-secondNum));      
		break;    
		case "*":    
		 System.out.println(firstNum+"*"+secondNum+"="+(firstNum*secondNum));  
		break;    
		case "/":       
		 System.out.println(firstNum+"/"+secondNum+"="+(firstNum/secondNum));   
		 break;      
					  
	default:   
		 System.out.println("��������....");
		 }	  


}
}
