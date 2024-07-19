package solopractice.object.practice8;

public class Airplane extends Plane{

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		int usefuel = distance*3;
		super.setFuelSize((super.getFuelSize() - usefuel));
		System.out.println(super.getPlaneName() + "\t " + super.getFuelSize());
	}
}
