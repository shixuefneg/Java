package texsWork;

public class Computer1 {
	//1.˽�л�����
		private String cBrand;  //Ʒ��
		private String cName;  //��������	
		private int cPrice; //�۸�
		
		
		public void setBrand(String cBrand) {
			this.cBrand = cBrand;
		}
		//����
		public String getComName() {
			return cName;
		}
		public void setSize(String cNane, String cName) {
			this.cName = cName;
		}
		//�۸�
		public double getPrice() {
			return cPrice;
		}
		public void setPrice(int cPrice) {
			this.cPrice = cPrice;
			}
		//�޲�
	public Computer1() {
			
			// TODO Auto-generated constructor stub
		}
			//3�����췽�����вΣ�
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
