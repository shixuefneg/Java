
public class dome1 {
	public static void main(String[] args) {
		int random = (int)(Math.random()*90000)+10000;
		int num=1234;
		int ge =num%10;//��λ��
		int shi =num/10%10;//ʮλ��
		int bai = num/100%10;//��λ
		int qian = num/1000;//ǧλ
		int sum =ge+shi+bai+qian;  //�ܺ�
		System.out.println("1234�ĸ�λ��֮��"+sum);
	}
}
