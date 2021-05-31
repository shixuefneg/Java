package zuoye;
//1-500之间能被13或者5整除的数的和
public class z6 {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=500;i++){
		if(i%13==0||i%5==0){
			sum+=i;
		}
	}
	System.out.println("1-500之间能被13或者5整除的数的和："+sum);
}
}
