package texsWork;

public class Computer1 {
	//1.私有化属性
		private String cBrand;  //品牌
		private String cName;  //电脑名称	
		private int cPrice; //价格
		
		
		public void setBrand(String cBrand) {
			this.cBrand = cBrand;
		}
		//名称
		public String getComName() {
			return cName;
		}
		public void setSize(String cNane, String cName) {
			this.cName = cName;
		}
		//价格
		public double getPrice() {
			return cPrice;
		}
		public void setPrice(int cPrice) {
			this.cPrice = cPrice;
			}
		//无参
	public Computer1() {
			
			// TODO Auto-generated constructor stub
		}
			//3、构造方法（有参）
	public Computer1(String cBrand, String cName, int cPrice) {
		super();
		this.cBrand = cBrand;
		this.cName = cName;
		this.cPrice = cPrice;
	}
		@Override
			public String toString() {
				return "Computer1 [cBrand=" + cBrand + ", cName=" + cName
						+ ", cPrice=" + cPrice + "]";
			}
			
		
	
		
	
		
}
