package list_ex.emp;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1.Service 생성된 객체(싱글톤)를 하나 받아온다..
		EmpService service = EmpService.getInstance();
		Manager m1 = new Manager("한국", new MyDate(2001,1,1), 3000, "개발부", 10);
		Manager m2 = new Manager("자바", new MyDate(2001,1,1), 3000, "개발부", 10);
		Manager m3 = new Manager("자바", new MyDate(2001,1,1), 3000, "개발부", 10);
		
		System.out.println("직원추가");
		service.addEmployee(m1);
		service.addEmployee(m2);
		service.addEmployee(m3);
		
		service.getEmployee();
		System.out.println("직원 삭제");
		service.deleteEmplyee("자바자바");
		service.getEmployee();
		
		System.out.println("직원 수정");
		service.updateEmp(new Manager("자바",new MyDate(2008,9,1), 3500, "연구부", 30));
		service.getEmployee();
		
		System.out.println("직원 검색");
		service.findEmployee(3000);
	}
}
