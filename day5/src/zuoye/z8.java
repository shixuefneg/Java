package zuoye;
//���1-300֮���ܹ���13�����ĵ�5����
public class z8 {
public static void main(String[] args) {
	int sum=0;
	
	for(int i=0;i<=300;i++){
		if(i%13==0 &&i%5==0){
			sum=sum+i;
			
		}
	}
	System.out.println("1-300֮���ܹ���13�����ĵ�5����"+sum);

}
}
