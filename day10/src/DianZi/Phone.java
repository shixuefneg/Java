package DianZi;

public class Phone extends Dianzi {
	private String pCard;

	public String getpCard() {
		return pCard;
	}

	public void setpCard(String pCard) {
		this.pCard = pCard;
	}

	

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, String type, int price) {
		super(name, type, price);
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, String type, int price, String pCard) {
		super(name, type, price);
		this.pCard = pCard;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Ʒ��:"+name+"�ͺ�"+type+"�۸�"+price+"�ֻ�������"+pCard);
	}

	
	

	
	
}
