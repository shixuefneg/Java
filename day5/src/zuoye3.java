//���1-500֮���ܹ���13����5������ż����ÿ����ʾ5����Ȼ����������Щż���ĺ�
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
