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
			System.out.println("请输入第" + (i + 1) + "购物金额：");
			a[i]=sc.nextDouble();
			add[i]=a[i];
			sum+=a[i];
		}
		System.out.println();
		System.out.println("序号\t\t\t金额（元）");
		for(int i=0;i<add.length;i++){
			xh=i+1;
			System.out.println(xh + "\t\t\t" + add[i]);
			
		}
		System.out.println("总金额（元）\t\t " + sum);
	}

}
