package DianZi;
/**
 * ����
 * @author shixuefeng
 *
 */
public abstract class Dianzi {
	protected String name;
	protected String type;
	protected int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//�޲�
	public Dianzi() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�в�
	public Dianzi(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	//�����Ϣ
	public abstract void print();
	
}
