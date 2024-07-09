package test.t240709.object2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건 이름 : ");
		String name = sc.next();
		
		System.out.print("물건 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("브랜드 : ");
		String brand = sc.next();
		
		Product pro1 = new Product(name, price, brand);
		
		
		pro1.information();
		
	}

}
