package lianxi;
/**
 *   *****			5��     
 *   *****
 *   *****			���ѭ�������������ڲ�ѭ������ÿ�е�*����
 *   *****
 *   *****
 */
public class lianxi1 {
public static void main(String[] args) {
	//ֱ��������111
	System.out.print("ֱ��������========================");
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//ֱ��������222
	System.out.print("ֱ��������========================");
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//ֱ��������333
	System.out.print("ֱ��������========================");
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//��ֱ��������
	System.out.println("��ֱ��������----------------------");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	//��ֱ��������
	System.out.println("��ֱ��������----------------------");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	//��ֱ��������
	System.out.println("��ֱ��������----------------------");
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	//����������
	System.out.println("����������-----------------------------");
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
	System.out.println("����������-----------------------------");
		for(int i=1 ; i<=5; i++){
			for(int j=1;j<= 5-i;j++){
				System.out.print(" ");
			}
				for(int j=1;j<=2*i-1;j++){
					System.out.print("*");
		}
		System.out.println();
	}
		System.out.println("����������-----------------------------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	//������ֱ��������
		System.out.println("������ֱ��������----------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("������ֱ��������----------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("������ֱ��������----------------------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	//����
		System.out.println("����------------------------------------");
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
		System.out.println("����------------------------------------");
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
		System.out.println("����------------------------------------");
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
	//�����Σ�ɳ©��
		
		System.out.println("������------------------------------------");
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
		System.out.println("������------------------------------------");
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
		System.out.println("������------------------------------------");
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
