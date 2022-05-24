package servlet.session.example;

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

import util.DBClose;
import util.DBSingleton;

public class MemberDAO {
	private Connection con;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	private DataSource dataFactory;
	
	public MemberDAO() {
		//con=DBSingleton.getInstance();
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
	public void addMember(MemberVO vo) {
		try {
			con=dataFactory.getConnection();
			String sql = "INSERT INTO t_member (id,pwd,name,email) values (?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
		}finally {
			DBClose.close(ps);
		}
		
	}
	public void delMember(String id) {
		try {
			con=dataFactory.getConnection();
			String sql = "DELETE FROM t_member WHERE id=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
		}finally {
			DBClose.close(ps);
		}
		
	}
	
	public boolean isExisted(MemberVO vo) {
		boolean result = false;
		String id = vo.getId();
		String pwd = vo.getPwd();
		try {
			con=dataFactory.getConnection();
			String sql = "select decode(count(*),1,'true','false') as result from t_member";
				  sql += " where id=? and pwd=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pwd);
			rs=ps.executeQuery();
			rs.next();
			result = Boolean.parseBoolean(rs.getString("result"));
			System.out.println("result="+result);
		} catch (SQLException e) {
			System.out.println("DB에러 : "+e.getMessage());
		}
		return result;
	}
}
