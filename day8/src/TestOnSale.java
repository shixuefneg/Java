
public class TestOnSale {
public static void main(String[] args) {
	//ʵ��������
	jingdonggouwu s= new jingdonggouwu();
	
	double price =2000;
	String type="����";
	

	//������۷���
	double nowPrice = s.sale(price, type);
	if(type.equals("�ǻ�Ա")){
		System.out.println("����������"+nowPrice+"Ԫ�����Ƿǻ�Ա���޷������ۿ�");
		
	}else{
		System.out.println("����������"+price+"Ԫ�����Ļ�Ա��������"+type+"��Ա������ֻ��Ҫ֧��"+nowPrice+"Ԫ����");
	}
}
}
