
public class jingdonggouwu {
	public double sale(double price,String type){
		if(type.equals("»Æ½ð")){
			price =price* 0.8;
		}else if(type.equals("²¬½ð")){
			price =price* 0.75;
		}else if(type.equals("×êÊ¯")){
			price =price* 0.7;
	}
		return price;
	}	
}
