package test6;

public class TestCom{
	public static void main(String[] args) {
		Computer com =new Computer("��˶",16,9999,"��ɫ");
		System.out.println(com.toString());
		com.setPrice(999.9);
		System.out.println(com.getPrice());
	}
}
