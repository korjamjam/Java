package test.t240711.object2;

public class TV {
	private String brand;
	private int open;
	private int size;
	private int price;
	
	public TV() {
		super();
	}

	public TV(String brand, int open, int size, int price) {
		super();
		this.brand = brand;
		this.open = open;
		this.size = size;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		String res =  this.brand + "에서 만든 " + this.open + "년 " + this.size + "인치 TV" + " 가격 : " + this.price;
		System.out.println(res);
	} 
	
	
	

}
