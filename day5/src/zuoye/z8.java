package zuoye;
//输出1-300之间能够被13整除的第5个数
public class z8 {
public static void main(String[] args) {
	int sum=0;
	
	for(int i=0;i<=300;i++){
		if(i%13==0 &&i%5==0){
			sum=sum+i;
			
		}
	}
	System.out.println("1-300之间能够被13整除的第5个数"+sum);

}
}
