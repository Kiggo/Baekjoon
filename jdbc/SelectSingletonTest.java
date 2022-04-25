package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectSingletonTest {
	Connection con; //DB연결
	Statement st; //쿼리문장변환
	ResultSet rs; //테이블의 데이터구조를 똑같이 만들어준다
	
	public SelectSingletonTest() {
		con=DBSingleton.getInstance();
	}
	public void searchEmp() {
		String sql = "SELECT * FROM emp";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			System.out.println("사원번호\t사원명\t급여");
			while(rs.next()) {
				//rs에 있는 각 칼럼의 데이터 형식 가져옴
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				double sal=rs.getDouble("sal");
				System.out.println(empno+"\t"+ename+"\t"+sal);
			}
		} catch (SQLException e) {
			System.out.println("예외 발생: "+e.toString());
		}finally {
				try {
					if(rs!=null)rs.close();
					if(st!=null)st.close();
				} catch (SQLException e) {
					System.out.println("닫기 실패!!!");
				}
		}
	}
	public static void main(String[] args) {
		SelectSingletonTest emp = new SelectSingletonTest();
		emp.searchEmp();
	}
}
