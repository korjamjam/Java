package test.t240715.object2;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석","남궁성",30000, "도우출판",0.1);
		bArray[1] = new Book("열혈강의 자바","구정은",29000, "프리렉",0.1);
		bArray[2] = new Book("객체지향 JAVA8","금영욱",30000, "북스홈",0.1);
		
		for(Book b : bArray) {
			System.out.printf("%s, %s, %s, %d원, %d%%할인 ",b.getTitle(),b.getAuthor(),b.getPublisher(),b.getPrice(),(b.getDiscountRate()*100));
		}
		
	}

}
