
public class dome1 {
public static void main(String[] args) {
	int i=100;
	int count=0;
	
	while(i<=999){
		int ge = i%10;
		int shi =i/10%10;
		int bai = i/100;
		
		int sum=bai*bai*bai+shi*shi*shi+ge*ge*ge;
		if(sum==i){
			count++;
			System.out.println(i);
		}
		i++;
	}
	System.out.println("水仙花的个数是："+count);
}
}
