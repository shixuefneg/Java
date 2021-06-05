/**
 * 
 */
package test6;

/**
 * @author shixuefeng
 *
 */
public class Computer3 {
	//1.私有化属性
	private String brand;  //品牌
	private int size;   //内存大小
	private double price; //价格
	private String color; //颜色
	
	//2、创建get和set方法
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
//3、构造方法
	public Computer3(){
		
	}
	public Computer3(String brand, int size, double price, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}
	//4、测试数据
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", size=" + size + ", price="
				+ price + ", color=" + color + "]";
	}
	

	
	
}
