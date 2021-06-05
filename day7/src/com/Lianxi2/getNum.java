package com.Lianxi2;

public class getNum {
 public void Chushu(){
	 int count=0;
	 for(int i=1;i<=1000;i++){
		 if(i%3==2&&i%5==3&&i%7==2){
			 System.out.print(i+"\t");
			  count++;
			  if(count==5){
				  System.out.println();
			  }
		 }
		
		
	 }
	 System.out.println("×Ü¸öÊý£º"+count);
 }
}
