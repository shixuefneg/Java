//ͳ��1-1000֮��ͬʱ�������������������ж��ٸ�  	��3������2�� ��5������3����7������2
public class zuoye2 {
public static void main(String[] args) {
	int count=0;
	for(int j=1;j<=1000;j++){
		if((j%3==2)&(j%5==3)&(j%7==2)){
			count++;
			System.out.println(j);
		}
	}
	System.out.println("���������������������У�"+count);
}
}
