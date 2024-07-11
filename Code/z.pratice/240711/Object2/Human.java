package test.t240711.object2;

public class Human {
	TV t = new TV();
	
	private String name;
	private int money;
		
	//기본 생성자
	public Human() {
		super();
	}
	
	public Human(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buy(TV t) {
		System.out.println(this.name +"님이 가진 금액 : " + this.money);
		System.out.println(this.name + "님 " + "구매내역");
		System.out.println(t.getBrand() + "에서 만든 " + t.getOpen() + "년 " + t.getSize() + "인치 TV" + " 가격 : " + t.getPrice());
		if(this.money < t.getPrice()) {
			System.out.println(this.name + "님 잔액이 부족하여 구매하실 수 없습니다.");
		}
		else {
			int minus = this.money - t.getPrice();
			System.out.println("남은 잔액 :" + minus);
		}
	
	}
	
}
