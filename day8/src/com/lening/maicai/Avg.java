package com.lening.maicai;

public class Avg {
	//��ƽ����
	public double shucai(int[] jiage){
		double s=0;
		for(int i=0;i<jiage.length;i++){
			s=(jiage[i]+s)/5;
		}
		return s;
	}
	//����ͼ�
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
