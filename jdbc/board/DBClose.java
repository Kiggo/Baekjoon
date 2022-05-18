package jdbc.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClose {
	public static void close(PreparedStatement ps) {
			try {
				if(ps!=null) ps.close();
			} catch (SQLException e) {	}
	}
	public static void close(Statement st) {
			try {
				if(st!=null) st.close();
			} catch (SQLException e) {}
	}
	public static void close(ResultSet rs) {
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {}
	}
}
