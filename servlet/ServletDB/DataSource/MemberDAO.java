package servlet.ServletDB.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import servlet.util.DBClose;
import servlet.util.DBSingleton;

public class MemberDAO {
	private Connection con;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	private DataSource dataFactory;
	
	public MemberDAO() {
		//con=DBSingleton.getInstence();
		try {
			Context ctx = new InitialContext();
			Context envContext=(Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {System.out.println("Connection Pool Error:"+e.getMessage());}
	}
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		String sql = "SELECT * FROM t_member";
		try {
			//ps=con.prepareStatement(sql);
			con=dataFactory.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setJoinDate(rs.getDate("joinDate"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return list;
	}
}
