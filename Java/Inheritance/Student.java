package Inheritance;

public class Student extends People{ // A is a B A는 B이다

	private int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
		super(name,ssn); // 상위클래스 생성자 메소드 호출
		// this.name = name;
		// this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	@Override // 재정의
	
	public String toString() { 
		return "Student [name=" + name + ", ssn=" + ssn + ", studentNo=" + studentNo + "]";
		//return "Student [ studentNo=" + studentNo + "]";
	}

	//toString(): 객체가 자동으로 호출되는 메소드
	
}
