package lianxi;
/**
 *   *****			5行     
 *   *****
 *   *****			外层循环控制行数，内层循环控制每行的*个数
 *   *****
 *   *****
 */
public class lianxi1 {
public static void main(String[] args) {
	//直角三角形111
	System.out.print("直角三角形========================");
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//直角三角形222
	System.out.print("直角三角形========================");
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//直角三角形333
	System.out.print("直角三角形========================");
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//反直角三角形
	System.out.println("反直角三角形----------------------");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	//反直角三角形
	System.out.println("反直角三角形----------------------");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	//反直角三角形
	System.out.println("反直角三角形----------------------");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	//等腰三角形
	System.out.println("等腰三角形-----------------------------");
	for (int i = 1; i <= 5; i++) {
    	//打印空格
    	for (int j = 1; j <= 5 - i ; j++) {
    		System.out.print(" ");
    	}
    	//打印*
    	for (int j = 1; j <= 2 * i - 1; j++) {
    		System.out.print("*");
    	}
    	//换行
    	System.out.println();
    }
	System.out.println("等腰三角形-----------------------------");
		for(int i=1 ; i<=5; i++){
			for(int j=1;j<= 5-i;j++){
				System.out.print(" ");
			}
				for(int j=1;j<=2*i-1;j++){
					System.out.print("*");
		}
		System.out.println();
	}
		System.out.println("等腰三角形-----------------------------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	//反等腰直角三角形
		System.out.println("反等腰直角三角形----------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("反等腰直角三角形----------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("反等腰直角三角形----------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	//菱形
		System.out.println("菱形------------------------------------");
		for(int i=0;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("&");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++){
				System.out.print("&");
			}
			
			System.out.println();
			
		}
		System.out.println("菱形------------------------------------");
		for(int i=0;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("&");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++){
				System.out.print("&");
			}
			
			System.out.println();
			
		}
		System.out.println("菱形------------------------------------");
		for(int i=0;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("&");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++){
				System.out.print("&");
			}
			
			System.out.println();
			
		}
	//反菱形（沙漏）
		
		System.out.println("反菱形------------------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("^");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("^");
			}
			System.out.println();
		}
		System.out.println("反菱形------------------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("^");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("^");
			}
			System.out.println();
		}
		System.out.println("反菱形------------------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("^");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("^");
			}
			System.out.println();
		}
		
}
}
