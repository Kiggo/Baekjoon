package list_ex.emp;

public class Manager extends Employee{
	private String dept;
	private int deptno;
	
	public Manager(String name, MyDate birthDate, double salary, String dept, int deptno) {
		super(name, birthDate, salary);
		this.dept = dept; 
		this.deptno = deptno;
	}
	
	public Manager(int ssn, String name, MyDate birthDate, double salary, String dept, int deptno) {
		super(ssn, name, birthDate, salary);
		this.dept = dept;
		this.deptno = deptno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return super.toString()+ " " + dept + " " + deptno;
	}
	
	
}
