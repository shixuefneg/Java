package xiawu;
//实现登陆功能：如果用户名输入“tom”，密码“123”，提示登陆成功，否则提示输入错误，请重新输入！您还有XX次机会。 三次输入错误后将不可以再输入，并提示对不起，你的账号将被锁定，
import java.util.Scanner;

public class dome2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	    System.out.println("请输入用户名：");
	    String username = sc.nextLine();
	    System.out.println("请输入密码：");
	    String password = sc.nextLine();
	    int i = 3;
       
        do {
        	System.out.println("请输入用户名：");
            System.out.println("请输入密码");
            String s = sc.nextLine();
            if (s.equals("123")) {
                break;
            } else {
                System.out.println("还剩下" + --i + "次机会");
            }
        } while (i > 0);
    }
}

	 
   
