package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSingletonTest {
	Connection con=null;
	Statement st=null;
	
	public DeleteSingletonTest() {
		con=DBSingleton.getInstance();
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
		DeleteSingletonTest emp = new DeleteSingletonTest();
		int res = emp.deleteEmp(9090);
		if(res>0)
			System.out.println("데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	}
}
