package com.dome1;



public class ShuiXianHua {
 public void SXH (){
	
		int count=0;
		for(int i=100;i<=999;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai =i/100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
					System.out.println(i+"");
			count++;
			}
		}
	System.out.println("水仙花的总数有："+count);
 }
}
