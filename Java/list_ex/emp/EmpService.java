package list_ex.emp;

import java.util.ArrayList;

public class EmpService { //자료 저장 조회 변경 삭제
	private ArrayList<Employee> list;
	private static EmpService service = new EmpService();//외부에서 접근못하게해야함
	
	private EmpService() {
		list = new ArrayList<Employee>();
	}
	public static EmpService getInstance() {
		return service;
	}
	//자료 추가
	public void addEmployee(Employee e) {
		boolean flag = false;
		for(Employee emp : list) {
			if(e.getName().equals(emp.getName())) {
				flag = true;
				System.out.println(e.getName()+" 님은 이미 존재합니다.");
				return;
			}
		}
		if(flag==false) {
			list.add(e);
			System.out.println(e.getName()+" 님은 회원 가입 되셨습니다.");
		}
	}
	
	//list에 있는 내용 출력
	public void getEmployee() {
		for(Employee emp : list)
			System.out.println(emp);
	}
	//emp 삭제
	public void deleteEmplyee(String name) {
		boolean flag = false;
		for(Employee emp: list) {
			if(emp.getName().equals(name)) {
				flag = true;
				System.out.println(emp.getName()+"님이 삭제 되었습니다");
				list.remove(emp);
				break;
			}
		}
		if(flag==false)
			System.out.println("삭제할 내용이 없습니다");
	}
	//emp 변경 set()
	public void updateEmp(Employee e) {
		boolean flag = false;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().equals(e.getName())) {
				list.set(i, e);
				System.out.println(e.getName()+"님이 수정 되었습니다.");
				flag = true;
			}
		}
		if(flag==false) {
			System.out.println("수정할 내용이 없습니다");
			return;
		}
	}
	public ArrayList<Employee> findEmployee(double salary) {
		ArrayList<Employee> temp = new ArrayList<Employee>(); // 부서를 담을  새로운 공간
		for(Employee emp: list) {
			if(emp.getSalary()==salary) {
				temp.add(emp);
				System.out.println(temp);
			}
		}
		return temp;
	}
}
