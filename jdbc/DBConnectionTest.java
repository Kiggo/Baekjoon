package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
	public static void main(String[] args) {
		Connection con = null; // 클래스 선언
		//오라클 url 경로
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER="oracle.jdbc.OracleDriver";
		
		try {
			Class.forName(DRIVER);
			System.out.println("Oracle 드라이버 로딩 성공");
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB접속 에러:"+e.getMessage());
		}finally {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {}
		}
	}
}
