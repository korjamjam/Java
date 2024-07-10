package solopractice.object.practice4;

public class Snack {
	private String kind; //종류
	private String name; //이름
	private String flavor; //맛
	private int numOf; //개수
	private int price; //가격
	
	//기본생성자
	public Snack() {
		super();
	}
	
	//매개변수 있는 생성자
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	//getXXX() 저장된 데이터를 불러오는 메소드
	//setXXX() 데이터를 변수에 저장하는 메소드
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 

	//담긴 데이터를 리턴하는 메소드
	public String information() {
		String result = "종류는 "+ this.kind + "이고 "+ this.flavor + "맛 " + 
						this.name +"이며 " + this.numOf + "개당 "+ this.price + "원 입니다.";
		
		return result;
	}
	
	

}
