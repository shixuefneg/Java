
public class dome1 {
	public static void main(String[] args) {
		int random = (int)(Math.random()*90000)+10000;
		int num=1234;
		int ge =num%10;//各位数
		int shi =num/10%10;//十位数
		int bai = num/100%10;//百位
		int qian = num/1000;//千位
		int sum =ge+shi+bai+qian;  //总和
		System.out.println("1234的各位数之和"+sum);
	}
}
