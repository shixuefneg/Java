package xiawu;


//3������4λ�������е�������ǧλ�ĺͣ���λ�ĺͣ�ʮλ�ĺͣ���λ�ĺ͡����Ҵ�ӡ�����
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
			
			
			
			
			
		}System.out.println("4λ�������е�������ǧλ�ĺ�:"+qianSum+"��λ�ĺͣ�"+baiSum+"ʮλ�ĺ�:"+shiSum+"��λ�ĺͣ�"+geSum);

	}
}
