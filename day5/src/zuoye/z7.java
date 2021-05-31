package zuoye;
//4、输出1-300之间能够被13和5整除的数的和
public class z7 {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=300;i++){
		if(i%13==0||i%5==0){
			sum+=i;
		}
	}
	System.out.println("1-300之间能被13或者5整除的数的和："+sum);
}
}
