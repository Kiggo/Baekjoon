package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateSingletonTest {
	Connection con=null;
	Statement st=null;
	
	public UpdateSingletonTest() {
		con=DBSingleton.getInstance();
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
		UpdateSingletonTest emp = new UpdateSingletonTest();
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
