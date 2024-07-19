package solopractice.object.practice8;

public class PlaneTest {

	public static void main(String[] args) {
		
		// Airplane 과 Cargoplane 객체 생성
		Airplane air = new Airplane("L747", 1000);
		Cargoplane cargo = new Cargoplane("C40", 1000);
		
		System.out.printf("Plane\t fuelSize\n");
		System.out.println("------------------");
		
		// 생성된 객체의 정보 출력 
		System.out.printf(air.getPlaneName() + "\t " + air.getFuelSize()+"\n");
		System.out.printf(cargo.getPlaneName() + "\t " + cargo.getFuelSize()+"\n");
		
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		System.out.println("100 운항");
		System.out.printf("Plane\t fuelSize\n");
		System.out.println("------------------");
		air.flight(100);
		cargo.flight(100);
		
		System.out.println("200 주유");
		System.out.printf("Plane\t fuelSize\n");
		System.out.println("------------------");
		air.refuel(200);
		cargo.refuel(200);

	}

}
