package zuoye;

/**
 *   *****			5行     
 *   *****
 *   *****			外层循环控制行数，内层循环控制每行的*个数
 *   *****
 *   *****
 */
public class z2shalou {
public static void main(String[] args) {
	for (int i = 5; i >= 0; i--)
	{
		for (int j = 0; j < 5 - i; j++)
		{
			System.out.print(" ");
		}
		for (int j = 2 * i - 1; j > 0; j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
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
}
}
