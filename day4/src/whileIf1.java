
public class whileIf1 {
public static void main(String[] args) {
	int i =1;
	int sum=0;
	int count =0;  //�����count 
	while(i<=500){
		if(i%13==0||i%5==0){
			if(i%2==0){
				sum=sum+i;
				count++;
				System.out.println(i+"\t");
				if(count%4==0){
					System.out.println();
				}
			}
		}
		i++;
	}
	System.out.println("\n���1-500֮���ܹ���13����5������ż���ĺͣ�"+sum);
}
}
