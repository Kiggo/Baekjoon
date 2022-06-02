package list_ex.emp;

public class EmpServiceMapTest {
	public static void main(String[] args) {
		EmpServiceMap service = EmpServiceMap.getInstance();
		Manager m1 = new Manager(123, "korea", new MyDate(2021,1,1), 4000, "개발부", 10);
		service.addEmployee(m1);
		service.addEmployee(m1);
		service.getEmployee();
	}
}
