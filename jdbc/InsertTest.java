package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	Connection con = null; // 클래스 선언
	Statement st = null; //쿼리 문장을 생성
	PreparedStatement ps; //쿼리 문장을 생성
	//DB연결
	//오라클 url 경로
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String DRIVER="oracle.jdbc.OracleDriver";
	
	public InsertTest() {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로드 성공");
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없다"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러"+e.getMessage());
		}/*finally {
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
	/*public int insertDate(EmpVO vo) {
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
				if(ps!=null) ps.close();
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}*/
	public int preparedEmp(EmpVO vo) { //result 가 정수형이기때문에 int
		//int empno=vo.getEmpno();
		//String ename=vo.getEname();
		//double sal=vo.getSal();
		int result = 0;
		try {
			ps = con.prepareStatement("INSERT INTO emp(empno,ename,sal) VALUES(?,?,?)");
			System.out.println("PreparedStatement 생성 성공");
			ps.setInt(1, vo.getEmpno()); //ps.setInt(1, empno);
			ps.setString(2, vo.getEname()); //ps.setString(2, ename);
			ps.setDouble(3, vo.getSal()); //ps.setDouble(3, sal);
			result=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InsertTest insert = new InsertTest();
		EmpVO vo = new EmpVO();
		//키보드에서 값을 입력
		System.out.print("사원번호:");
		//int empno = sc.nextInt();
		vo.setEmpno(sc.nextInt());
		sc.nextLine(); //개행문자 처리
		System.out.print("업무:");
		//String ename = sc.nextLine();
		vo.setEname(sc.nextLine());
		System.out.print("사원급여:");
		//double sal = sc.nextDouble();
		vo.setSal(sc.nextDouble());
		//int res = insert.insertData(empno,ename,sal);
		//int res = insert.insertDate(vo);
		int res=insert.preparedEmp(vo);
		System.out.println("결과 값:"+res);
		if(res>0)
			System.out.println("데이터 추가 성공");
		else
			System.out.println("데이터 추가 실패");
			
	}
}
