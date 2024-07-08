package f.object.ex1;
public class Run1 {
	
	public static void main(String[] args) {
		
		Menu kim = new Menu();
		Menu choi = new Menu();
		Menu jeon = new Menu();

		kim.foodname("라면");
		kim.foodtype("한식");
		kim.foodprice(5000);
		kim.receipt();
		
		choi.foodname("스테이크");
		choi.foodtype("양식");
		choi.foodprice(15000);
		choi.receipt();
		
		jeon.foodname("초밥");
		jeon.foodtype("일식");
		jeon.foodprice(3000);
		jeon.receipt();
		
	}
}
