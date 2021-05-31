//输出1-500之间能够被13或者5整数的偶数，每行显示5个，然后最后求出这些偶数的和
public class zuoye3 {
public static void main(String[] args) {
	int sum=0;
	int count=0;
	for(int i=0;i<=500;i++){
		if(i%13==0 ||i%5==0){
			if(i%2==0){
				System.out.print(i+"\t");
			sum=sum+i;
			count++;
			if(count%5==0){
				System.out.println();
			}
			}
			
			
		}
		
	}
	System.out.println("\n"+sum);
}
}
