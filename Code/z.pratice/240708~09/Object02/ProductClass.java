package test.t240709.object2;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}

	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	public String getPname() {
		return pName;
	}
	public void setPname() {
		this.pName = pName;
		return;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		return;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		return;
	}

	public void information() {
		System.out.println("물건이름 :"+ this.pName);
		System.out.println("가격 :"+ this.price);
		System.out.println("브랜드 :"+ this.brand);
	}
}
