
//水仙花数
public class zuoye1 {
public static void main(String[] args) {
	System.out.println("请输入一个3位数");
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
System.out.println("水仙花的总数有："+count);
	
}
}

