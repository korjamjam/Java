package f.object.ex1;

public class Menu {
	
	String foodname;
	String foodtype;
	int price = 0;
	int allprice = 0;
	
	public void foodname(String name) {
		foodname = name;
	}
	public void foodtype(String type) {
		foodtype = type;
	}
	public void foodprice(int won) {
		price = won;
	}
	public void allpirce(int money) {
		allprice += money;
	}
	
	public void receipt() {
		System.out.println("주문하신 음식 : " + foodname + " / 종류 : " + foodtype + " / 가격 :" + price);
	}

}
