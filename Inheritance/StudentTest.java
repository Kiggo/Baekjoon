package Inheritance;

public class StudentTest {
	public static void main(String[] args) {
		People p = new People(); // 매개 변수가 없는 생성자 메소드
		p.name = "aaa";  // 매개 변수가 없기때문에  직접 접근해야한다
		p.ssn = "123456"; // 매개 변수가 없기때문에  직접 접근해야한다
		People p2 = new People("bbb","23456"); // 매개 변수가 있는 생성자 메소드
			System.out.println("이름: "+p2.getName());
			System.out.println("Ssn: "+p2.getSsn());
			Student st = new Student("자바","1234567",123456);
			System.out.println(st);  
			
			/* st.toString을 안쓴다면
			 * String name = st.getName(); 
			 * String ssn = st.getSsn(); 
			 * int no = st.getStudentNo(); 
			 * System.out.println(name+","+ssn+","+no);
			 */
		
	}
}
