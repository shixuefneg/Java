package d1;
//输出1-1000之间所有可以被4整除的数字
public class d2 {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++){
		if(i%4==0){
			System.out.println(i);
		}
	}
}
}
