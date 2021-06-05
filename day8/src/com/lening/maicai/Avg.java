package com.lening.maicai;

public class Avg {
	//求平均价
	public double shucai(int[] jiage){
		double s=0;
		for(int i=0;i<jiage.length;i++){
			s=(jiage[i]+s)/5;
		}
		return s;
	}
	//求最低价
	public int ZDJ(int[] jiage){
		int c=jiage[0];
		for(int i=0;i<jiage.length;i++){
			
			if(jiage[i]<c){
				c=jiage[i];
			}
			
		}
		return c;
	}
}
