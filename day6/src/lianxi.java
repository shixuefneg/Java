import java.util.Scanner;


public class lianxi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double add[]=new double[5];
		double a[]=new double[5];
		int xh =0;
		double sum =0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("�������" + (i + 1) + "�����");
			a[i]=sc.nextDouble();
			add[i]=a[i];
			sum+=a[i];
		}
		System.out.println();
		System.out.println("���\t\t\t��Ԫ��");
		for(int i=0;i<add.length;i++){
			xh=i+1;
			System.out.println(xh + "\t\t\t" + add[i]);
			
		}
		System.out.println("�ܽ�Ԫ��\t\t " + sum);
	}

}
