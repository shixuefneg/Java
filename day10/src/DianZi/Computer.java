package DianZi;

public  class Computer extends Dianzi{
    private String cpu;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Computer(String name, String type, int price, String cpu) {
		super(name, type, price);
		this.cpu = cpu;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Ʒ��:"+name+"�ͺ�"+type+"�۸�"+price+"cpu��С"+cpu);
	} 
    
    
}


