package f.object.ex3;
import f.object.ex2.BankAccount; //public 클래스는 다른 패키지에서 가져와서 사용 가능

public class Run {

	public static void main(String[] args) {
		//클래스명 참조변수명 = new 생성자();
		
//		Book b1 = new Book("불안을 이기는 심리학", "자기계발", "황양밍", 120);		
//		Book b2 = new Book("자바란 무엇인가?", "전공서적" , "최지원", 350);		
//		Book b3 = new Book("언더그라운드", "르포르타지","무라카미 하루키", 120);		
//
//		System.out.println(b1.toString());
//		System.out.println(b2.toString());
//		System.out.println(b3.toString());
		
		Book b1 = new Book("불안을 이기는 ", "자기계발", "황양밍", 120);
		b1.setTitle("불안을 이기는 심리학");
		
		System.out.println(b1.getTitle());
	
		
		
//		check(b2);
//		System.out.println(b2.toString());
//		
	}
//	public static void check(Book tmp) {
//		System.out.println("tmp");
//		System.out.println(tmp.toString());
//		
//		tmp.title = "바꿔버림";
//	}
}
