package list_ex.emp;

public class Employee {
	private int ssn;
	private String name;
	private MyDate birthDate;;//년 /월 /일
	private double salary;
	
	public Employee(String name, MyDate birthDate, double salary) {
		this(0,name,birthDate,salary);
	}
	
	public Employee(int ssn, String name, MyDate birthDate, double salary) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + birthDate + " " + salary;
	}
	
}
