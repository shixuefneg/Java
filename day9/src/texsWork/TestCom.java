package texsWork;



public class TestCom {
	public static void main(String[] args) {
		Computer1 com =new Computer1("ÁªÏë","Õü¾ÈÕß",7999);
		System.out.println(com.toString());
		com.setPrice(8999);
		System.out.println(com.toString());
		System.out.println(com.getPrice());
		}
}
