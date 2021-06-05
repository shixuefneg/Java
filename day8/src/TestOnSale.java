
public class TestOnSale {
public static void main(String[] args) {
	//实例化对象
	jingdonggouwu s= new jingdonggouwu();
	
	double price =2000;
	String type="铂金";
	

	//调用则扣方法
	double nowPrice = s.sale(price, type);
	if(type.equals("非会员")){
		System.out.println("您本次消费"+nowPrice+"元，您是非会员，无法享受折扣");
		
	}else{
		System.out.println("您本次消费"+price+"元，您的会员卡类型是"+type+"会员，所以只需要支付"+nowPrice+"元即可");
	}
}
}
