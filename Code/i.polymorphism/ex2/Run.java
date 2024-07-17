package i.polymorphism.ex2;

public class Run {

	public static void main(String[] args) {
		//1. 부모타입 래퍼런스(참조변수)로 부모객체를 다루는 경우
		Car c1 = new Car("빨간색", "가솔린", 2020);
		c1.drive();
		System.out.println("==================");

		//2. 자식타입 래퍼런스(참조변수)로 다루는 경우
		Avante c2 = new Avante("검은색", "디젤", 2022);
		c2.drive();
		c2.moveAvante();
		System.out.println("==================");
		
		//3. 부모타입 래퍼런스로 자식객체를 다루는 경우
		Car c3 =c2;
		c3.drive();
		((Car)c2).drive();
		System.out.println("==================");

		Car c4 = new Sonata("흰색", "가스", 2023);
		c4.drive();
		((Sonata)c4).moveSonata();
		//-> Sonata c5 = (Sonata)c4;
		
		/*
		  "상속 구조"의 클래스들 간에 형변환이 가능하다
		  
		  1. UpCasting
		  	 자식 타입 -> 부모 타입으로 형변환
		  	 자동형변환
		  	 ex) Car c1 = new Sonata(); 
		  	 
		  	 
		  2. Down Casting
		  	 부모 타입 -> 자식 타입으로 형변환하는 것이다.
		  	 강제형변환 해야함.
		  	 ex) ((Sonata)c1).moveSonata();
		  	     ((자식)부모).자식메소드();
		 */
		
		//다형성
		//부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로 다룰 수 있는 기술

		//다형성의 장점
		
		//다형성 사용 전
		Sonata[] sonataArr = new Sonata[5];
		sonataArr[0] = new Sonata("흰색", "가스", 2022);
		Avante[] avanteArr = new Avante[5];
		avanteArr[0] = new Avante("흰색", "가스", 2023);
		
		//다형성 사용 후
		Car[] carArr = new Car[10];
		carArr[0] = new Sonata("흰색", "가스", 2022);
		carArr[1] = new Avante("검은색", "디젤", 2023);
		
		for(int i = 0; i<carArr.length; i++) {
			//해당 참조변수가 실제 Sonata객체를 참조하는지 확인
			if(carArr[i] instanceof Sonata) {
				 ((Sonata)carArr[i]).moveSonata();
				 
			}
			else if(carArr[i] instanceof Avante) {
				 ((Avante)carArr[i]).moveAvante();
				 
			}
			else {
				carArr[i].drive();
			}
		}
	}

}
