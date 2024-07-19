package test.t240719.object2;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 .
		
		System.out.println("name \t department \t salary ");
		System.out.println("------------------------------------");
		
		employees[0] = new Secretary("Hilery", 1 ,"secretary" ,800);
		employees[1] = new Sales("Clinten", 2 ,"sales" ,1200);
		
		// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.)
		for(Employee emp : employees) {
			System.out.printf(emp.getName()+"\t" + emp.getDepartment()+ "\t" + emp.getSalary()+"\n");
		}
		System.out.println();
		System.out.println("인센티브 100 지급");	
		
		// 모든 객체에 인센티브 100 씩 지급핚 급여를 계산하고 다시 객체의 salary에 넣는다 .
		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);

		
		System.out.println("name\t department \t salary \t tax");
		System.out.println("------------------------------------");
		for(Employee emp : employees) {
			System.out.printf(emp.getName()+"\t" + emp.getDepartment()+ "\t" + emp.getSalary()+"\t" + emp.tax()+"\n");
		}
		
		// 모든 객체의 정보와 세금을 출력한다 (for 문을 이용하여 출력한다.)
	}

}
