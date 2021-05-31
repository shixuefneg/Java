package xiawu;

import java.util.Scanner;

public class dome10 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("请输入第一个数:");
	  int firstNum = in.nextInt(); 
	  System.out.println("请输入算数运算符号：");      
	  String s = in.next();      
	  System.out.println("请输入第二个数字：");    
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
		 System.out.println("输入有误....");
		 }	  


}
}
