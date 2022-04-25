package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
	Connection con=null;
	Statement st=null;
	//DB연결
	//오라클 url 경로
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String DRIVER="oracle.jdbc.OracleDriver";
	
	public UpdateTest() {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로드 성공");
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없다"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러"+e.getMessage());
		}
	}

	public int updateEmp(EmpVO vo) {
		int empno=vo.getEmpno();
		String job=vo.getJob();
		double sal=vo.getSal();
		
		String sql ="UPDATE emp SET job='"+job+"',sal="+sal+" WHERE empno="+empno+" ";
		int result=0;
		try {
			st=con.createStatement();
			result=st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사원번호 급여 업무를 변경한다	
		UpdateTest emp = new UpdateTest();
		EmpVO vo = new EmpVO();
		//키보드에서 값을 입력
		System.out.print("사원번호:");
		int empno = sc.nextInt();
		vo.setEmpno(empno);
		sc.nextLine(); //개행문자 처리
		System.out.print("업무:");
		String job = sc.nextLine();
		vo.setJob(job);
		System.out.print("급여:");
		double sal = sc.nextDouble();
		vo.setSal(sal);
		int res = emp.updateEmp(vo);
		System.out.println("결과 값:"+res);
		if(res>0)
			System.out.println("Update 성공");
		else
			System.out.println("Update 실패");
	}
}
