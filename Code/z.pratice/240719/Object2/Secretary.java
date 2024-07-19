package test.t240719.object2;

public class Secretary extends Employee implements Bonus {

	
	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}


	public double tax() {
		return this.getSalary() * 0.1;
	}

	@Override
	public void incentive(int pay) {
		super.setSalary((int)(super.getSalary() * 1.1));
		return;
	}

}
