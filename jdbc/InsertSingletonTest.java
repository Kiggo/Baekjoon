package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertSingletonTest {
	Connection con = null; // 클래스 선언
	Statement st = null;
	//DB연결
	//오라클 url 경로
	
	public InsertSingletonTest() {
		con=DBSingleton.getInstance();
		/*finally {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {}
		}*/
	}
	public int insertData(int empno, String ename, double sal) {
		String sql="INSERT INTO emp(empno,ename,sal) VALUES("+empno+",'"+ename+"',"+sal+")";
		int result=0;
		try {
			st=con.createStatement();
			result=st.executeUpdate(sql); //executeUpdate : insert,update,delete 
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
	public int insertDate(EmpVO vo) {
		int empno=vo.getEmpno();
		String ename=vo.getEname();
		double sal=vo.getSal();
		
		String sql="INSERT INTO emp(empno,ename,sal) VALUES("+empno+",'"+ename+"',"+sal+")";
		int result=0;
		try {
			st=con.createStatement();
			result=st.executeUpdate(sql); //executeUpdate : insert,update,delete 
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
		InsertSingletonTest insert = new InsertSingletonTest();
		EmpVO vo = new EmpVO();
		//키보드에서 값을 입력
		System.out.print("사원번호:");
		int empno = sc.nextInt();
		vo.setEmpno(empno);
		sc.nextLine(); //개행문자 처리
		System.out.print("사원성명:");
		String ename = sc.nextLine();
		vo.setEname(ename);
		System.out.print("사원급여:");
		double sal = sc.nextDouble();
		vo.setSal(sal);
		//int res = insert.insertData(empno,ename,sal);
		int res = insert.insertDate(vo);
		System.out.println("결과 값:"+res);
		if(res>0)
			System.out.println("데이터 추가 성공");
		else
			System.out.println("데이터 추가 실패");
			
	}
}
