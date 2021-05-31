import java.util.Scanner;


public class dome5 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("请输入班级总人数");
	int num=input.nextInt();
	int count=0;
	for(int i=1;i<=num;i++){
		System.out.println("请输入第"+i+"位学员成绩");
		int score=input.nextInt();
		if(score<80){
			continue;//跳出当前循环，执行下一次循环
			
		}
		count++;
	}
	System.out.println("80分以上的学生人数为："+count);
	System.out.println("80分以上学生所占比例为："+(double)count/num*100+"%");
}
}
