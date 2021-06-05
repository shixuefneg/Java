package Traffic;

public abstract class JiaoTong {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiaoTong() {
		super();
		// TODO Auto-generated constructor stub
	
	}

	public JiaoTong(String name) {
		super();
		this.name = name;
	}
	// ‰≥ˆ–≈œ¢
	public abstract void print();
	
}
