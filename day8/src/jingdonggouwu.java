
public class jingdonggouwu {
	public double sale(double price,String type){
		if(type.equals("�ƽ�")){
			price =price* 0.8;
		}else if(type.equals("����")){
			price =price* 0.75;
		}else if(type.equals("��ʯ")){
			price =price* 0.7;
	}
		return price;
	}	
}
