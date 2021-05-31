package zuoye;
//1-100的奇數何爲：
public class z5 {
public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<=100;i++){
		if(i%2==1){
			sum+=i;
			
		}
		
	}
	System.out.println("1-100的奇數何爲："+sum);
}
}
