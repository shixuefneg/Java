/**
 * 
 */
package test6;

/**
 * @author shixuefeng
 *
 */
public class Computer3 {
	//1.˽�л�����
	private String brand;  //Ʒ��
	private int size;   //�ڴ��С
	private double price; //�۸�
	private String color; //��ɫ
	
	//2������get��set����
	private String getBrand(){
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//3�����췽��
	public Computer3(){
		
	}
	public Computer3(String brand, int size, double price, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}
	//4����������
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", size=" + size + ", price="
				+ price + ", color=" + color + "]";
	}
	

	
	
}
