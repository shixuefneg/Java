import java.util.Scanner;


public class dome5 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("������༶������");
	int num=input.nextInt();
	int count=0;
	for(int i=1;i<=num;i++){
		System.out.println("�������"+i+"λѧԱ�ɼ�");
		int score=input.nextInt();
		if(score<80){
			continue;//������ǰѭ����ִ����һ��ѭ��
			
		}
		count++;
	}
	System.out.println("80�����ϵ�ѧ������Ϊ��"+count);
	System.out.println("80������ѧ����ռ����Ϊ��"+(double)count/num*100+"%");
}
}
