package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	Connection con; //DB연결
	Statement st; //쿼리문장변환
	ResultSet rs; //DB에서 select 한결과를 저장하는 클래스
	PreparedStatement ps; 
	//String url="jdbc:oracle:thin:@localhost:1521:xe";
	//String DRIVER="oracle.jdbc.OracleDriver";
	
	public SelectTest() {
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
	
	public void searchEmp() {
		String sql = "SELECT * FROM emp";
		try {
			//st=con.createStatement();
			ps=con.prepareStatement(sql);
			//rs=st.executeQuery(sql);
			rs=ps.executeQuery(); 
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
		SelectTest emp = new SelectTest();
		emp.searchEmp();
	}
}
