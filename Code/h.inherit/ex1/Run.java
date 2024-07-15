package h.inherit.ex1;

public class Run {

	public static void main(String[] args) {
//		Man man1 = new Man("전제민");
//		man1.tellYourName();
		
		BusinessMan Bman = new BusinessMan("최지원", "KH", "강사");
		
		Bman.tellYourInfo();
	}

}
