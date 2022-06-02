package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import bean.MemberBean;
import util.DBClose;

public class MemberDAO {
	private DataSource dataFactory;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<MemberBean> listMembers(){
		List<MemberBean> membersList = new ArrayList<MemberBean>();
		String sql = "select * from t_member order by joinDate desc";
		try {
			con = dataFactory.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberBean vo = new MemberBean(id, pwd, name, email, joinDate);
				membersList.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("DB에러: "+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return membersList;
	}
	
	public void addMember(MemberBean memberVO) {
		String sql = "INSERT INTO t_member(id, pwd, name, email) VALUES(?,?,?,?)";
		try {
			con = dataFactory.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, memberVO.getId());
			ps.setString(2, memberVO.getPwd());
			ps.setString(3, memberVO.getName());
			ps.setString(4, memberVO.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB에러: "+e.getMessage());
		}finally {
			DBClose.close(ps);
		}
	}
	
	public MemberBean findMember(String _id) {
		MemberBean memInfo = null;
		String sql = "select * from t_member where id=?";
		try {
			con = dataFactory.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, _id);
			rs=ps.executeQuery();
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String email = rs.getString("email");
			Date joinDate = rs.getDate("joinDate");
			memInfo = new MemberBean(id,pwd,name,email,joinDate);
		
		} catch (SQLException e) {
			System.out.println("DB에러: "+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return memInfo;
	}
	
	public void modMember(MemberBean memberVO) {
		String sql = "update t_member set pwd=?,name=?,email=? where id=?";
		try {
			con=dataFactory.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, memberVO.getPwd());
			ps.setString(2, memberVO.getName());
			ps.setString(3, memberVO.getEmail());
			ps.setString(4, memberVO.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB에러: "+e.getMessage());
		}finally {
			DBClose.close(ps);
		}
	}
	
	public void delMember(String id) {
		String sql = "delete from t_member where id=?";
		try {
			con=dataFactory.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB에러: "+e.getMessage());
		}finally {
			DBClose.close(ps);
		}
		
	}
}
