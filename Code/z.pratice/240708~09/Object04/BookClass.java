package test.t240709.object4;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle() {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher() {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor() {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice() {
		this.price = price;
	}
	public double getdiscountRate() {
		return discountRate;
	}
	
	public void setdiscountRate() {
		this.discountRate = discountRate;
	}
	
	public double discountPrice() {
		double dis = this.price - (this.price * this.discountRate);
		return dis;
	}
	
	public void information() {
		System.out.println("책 이름 : " + this.title);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("작가 이름 : " + this.author);
		System.out.println("가격 : " + this.price);
		System.out.println("할인율 : " + this.discountRate + "%");
		System.out.println("할인 가격 : "+ this.discountPrice());
	}
	
}
