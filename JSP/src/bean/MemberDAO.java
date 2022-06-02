package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import util.DBClose;

public class MemberDAO {
	private Connection con;
	private PreparedStatement ps;
	private DataSource dataFactory;
	private ResultSet rs;

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
			System.out.println("Connection Pool Error"+e.getMessage());
		}
	}
	public int addMember(MemberBean memberBean) {
		int result = 0;
		try {
			con=dataFactory.getConnection();
			String sql = "insert into t_member";
			sql+=" (id,pwd,name,email)";
			sql+=" values(?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, memberBean.getId());
			ps.setString(2, memberBean.getPwd());
			ps.setString(3, memberBean.getName());
			ps.setString(4, memberBean.getEmail());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 저장 오류"+e.getMessage());
			return result;
		}finally {
			DBClose.close(ps);
		}
		return result; 
	}
	public List<MemberBean> listMembers(){
		List<MemberBean> list = new ArrayList<MemberBean>();
		String sql = "select * from t_member order by joinDate desc ";
		try {
			con=dataFactory.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberBean vo = new MemberBean();
				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setJoinDate(rs.getDate("joinDate"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("DB 오류"+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return list;
	}
}
