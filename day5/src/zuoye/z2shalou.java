package zuoye;

/**
 *   *****			5��     
 *   *****
 *   *****			���ѭ�������������ڲ�ѭ������ÿ�е�*����
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
    	//��ӡ�ո�
    	for (int j = 1; j <= 5 - i ; j++) {
    		System.out.print(" ");
    	}
    	//��ӡ*
    	for (int j = 1; j <= 2 * i - 1; j++) {
    		System.out.print("*");
    	}
    	//����
    	System.out.println();
    }
}
}
