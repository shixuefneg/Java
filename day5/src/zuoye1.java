
//ˮ�ɻ���
public class zuoye1 {
public static void main(String[] args) {
	System.out.println("������һ��3λ��");
	int count=0;
	for(int i=100;i<=999;i++){
		int ge = i%10;
		int shi = i/10%10;
		int bai =i/100;
		if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				System.out.println(i+"");
		count++;
		}
	}
System.out.println("ˮ�ɻ��������У�"+count);
	
}
}

