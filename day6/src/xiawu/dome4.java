package xiawu;
//4����ӡ1-500֮���ܹ���3��5�����ĵ�5��ż��
public class dome4 {
	
	public static void main(String[] args) {
		int count=0; 
		for(int i=1;i<=500;i++){
		if(i%3==0 && i%5==0){
			if(i%2==0){
				count++;
				if(count==5){
					System.out.println("1-500֮���ܹ���3��5�����ĵ�5��ż��:"+i);
				}
			}
		}
		}
	}
	
}
