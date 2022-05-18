package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

	private static Connection con = null;
	private DBSingleton() {}

	public static Connection getInstance() {
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER = "oracle.jdbc.OracleDriver";
		if(con==null) {
			try {
				Class.forName(DRIVER);
				System.out.println("Oracle 드라이버 로드 성공");
				con=DriverManager.getConnection(url, "scott", "tiger");
				System.out.println("DB 연결 성공");
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버를 찾을 수 없습니다."+e.getMessage());
			} catch (SQLException e) {
				System.out.println("DB 접속 에러 "+e.getMessage());
			}
		}
		return con;
	}
}

