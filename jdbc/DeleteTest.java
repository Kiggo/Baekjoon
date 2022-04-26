package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {
	Connection con=null;
	Statement st=null;
	PreparedStatement ps;
	//String url="jdbc:oracle:thin:@localhost:1521:xe";
	//String DRIVER="oracle.jdbc.OracleDriver";
	
	public DeleteTest() {
		/*try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로드 성공");
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없다"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러"+e.getMessage());
		}*/
		con=DBSingleton.getInstance();
	}
	//public int deleteEmp(int empno)
	public int deleteEmp(EmpVO vo) {
		//int empno=vo.getEmpno();
		int result=0;
		//String sql="DELETE FROM emp WHERE EMPNO="+empno+"";
		try {
			//st=con.createStatement();
			ps=con.prepareStatement("DELETE FROM emp WHERE EMPNO=?");
			System.out.println("PreparedStatement 생성 성공");
			ps.setInt(1, vo.getEmpno());
			//result=st.executeUpdate(sql);
			result=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB에러"+e.getMessage());
		}finally {
			try {
				if(st!=null) st.close();
				if(con!=null)con.close();
			} catch (Exception e2) {}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DeleteTest emp = new DeleteTest();
		EmpVO vo = new EmpVO();
		System.out.print("사원번호:");
		int empno = sc.nextInt();
		vo.setEmpno(empno);
		//int res = emp.deleteEmp(9999);
		int res = emp.deleteEmp(vo);
		if(res>0)
			System.out.println("데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	}
}
