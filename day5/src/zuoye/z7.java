package zuoye;
//4�����1-300֮���ܹ���13��5���������ĺ�
public class z7 {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=300;i++){
		if(i%13==0||i%5==0){
			sum+=i;
		}
	}
	System.out.println("1-300֮���ܱ�13����5���������ĺͣ�"+sum);
}
}
