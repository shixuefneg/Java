package zuoye;
//1-500֮���ܱ�13����5���������ĺ�
public class z6 {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=500;i++){
		if(i%13==0||i%5==0){
			sum+=i;
		}
	}
	System.out.println("1-500֮���ܱ�13����5���������ĺͣ�"+sum);
}
}
