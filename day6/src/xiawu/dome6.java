package xiawu;
//菱形
public class dome6 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
			
		}
		for(int k=1;k<=2*i-1;k++){
			System.out.print("*");
			
		}
		System.out.println();
	}
//	System.out.println("倒等腰三角形：");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
			
		}
		for(int k=1;k<=2*i-1;k++){
			System.out.print("*");
			
		}
		System.out.println();
	}
}
}
