package servlet.ServletDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import servlet.util.DBClose;
import servlet.util.DBSingleton;

public class MemberDAO {
	private Connection con;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO() {
		con=DBSingleton.getInterface();
	}
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		String sql = "SELECT * FROM t_member";
		try {
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
