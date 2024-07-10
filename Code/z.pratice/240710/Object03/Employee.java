package test.t240710.object3;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {
	super();
	}

	public Employee(int empNo, String name) {
		super();
		this.empNo = empNo;
		this.empName = name;
	}

	public Employee(int empNo, String name, String dept, 
			String job, int age,char gender, int salary, 
			double bonusPoint,String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = name;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void information() {
		System.out.println("번호 :" + empNo);
		System.out.println("이름 :" + empName);
		System.out.println("부서 :" + dept);
		System.out.println("직책 :" + job);
		System.out.println("나이 :" + age);
		System.out.println("성별 :" + gender);
		System.out.println("월급 :" + salary);
		System.out.println("보너스 :" + bonusPoint);
		System.out.println("전화번호 :" + phone);
		System.out.println("주소 :" + address);
		
		
	}
	
	
}
