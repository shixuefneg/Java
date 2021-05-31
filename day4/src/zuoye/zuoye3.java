package zuoye;

public class zuoye3 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0;i<=500;i++){
			if(i%13==0 ||i%5==0){
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
	}
}
