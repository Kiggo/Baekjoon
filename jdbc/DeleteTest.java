package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	Connection con=null;
	Statement st=null;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String DRIVER="oracle.jdbc.OracleDriver";
	
	public DeleteTest() {
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
	
	public int deleteEmp(int empno) {
		int result=0;
		String sql="DELETE FROM emp WHERE EMPNO="+empno+"";
		try {
			st=con.createStatement();
			result=st.executeUpdate(sql);
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
		DeleteTest emp = new DeleteTest();
		int res = emp.deleteEmp(9999);
		if(res>0)
			System.out.println("데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	}
}
