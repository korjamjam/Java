다형성(polymorphism)

부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로 다룰 수 있는 기술이다.
    
    클래스 참조변수  =  new 클래스 생성자;

(부모 클래스가 올 수 있다)  / (자식클래스로 생성할 수 있다)

실제로 어디까지 접근이 가능  / 실제로 어떤 형태의 메모리가 생성이 되는가


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
