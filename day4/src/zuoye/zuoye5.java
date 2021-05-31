package zuoye;

public class zuoye5 {
public static void main(String[] args) {
	int diwu=0;
	
	for(int i=1;i<=300;i++){
		if(i%13==0){
			diwu++;
			if(diwu==5){
				System.out.println(i);
			}
		}
	
	}
	
}
}
