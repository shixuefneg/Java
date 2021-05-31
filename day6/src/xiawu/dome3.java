package xiawu;


//3、计算4位数中所有的奇数的千位的和，百位的和，十位的和，个位的和。并且打印输出。
public class dome3 {
	public static void main(String[] args) {
	
		int geSum = 0;
		int shiSum = 0;
		int baiSum = 0;
		int qianSum = 0;
		
		for (int i = 1000; i <= 9999; i++) {
			if(i%2!=0){
				int ge = i % 10;

			int shi = i / 10 % 10;

			int bai = i / 100 % 10;

			int qian = i / 1000;
			geSum+=ge;
			shiSum+=shi;
			baiSum+=bai;
			qianSum+=qian;
			
			}
			
			
			
			
			
		}System.out.println("4位数中所有的奇数的千位的和:"+qianSum+"百位的和："+baiSum+"十位的和:"+shiSum+"个位的和："+geSum);

	}
}
