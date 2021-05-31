//统计1-1000之间同时满足如下条件的数据有多少个  	对3整除余2， 对5整除余3，对7整除余2
public class zuoye2 {
public static void main(String[] args) {
	int count=0;
	for(int j=1;j<=1000;j++){
		if((j%3==2)&(j%5==3)&(j%7==2)){
			count++;
			System.out.println(j);
		}
	}
	System.out.println("满足这样的条件的数据有："+count);
}
}
