package test.t240717.object1;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				count++;
			}else{
				break;
			}
		}
		return null;
	}
	
	public void insertStudent(String name, int age, double height,
							  double weight, int grade, String major) {
		for(int i=0; i<s.length; i++) {
			if(s[i] != null) {
				s[i] = new Student(name, age, height, weight, grade, major);
			}
			else {
				
			}
			
		}
	}
	
	public Student[] printStudent() {
		s.toString();
		return null;
	}
	
	public void insertEmployee(String name, int age, double height,
			  double weight, int salary, String dept) {
	}

	public Employee[] printEmployee() {
		e.toString();
		return null;
	}


}
