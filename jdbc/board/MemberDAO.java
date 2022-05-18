package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	public MemberDAO() {
		con = DBSingleton.getInstance();
	}
	
	//회원가입
	public int registerMember(MemberVO vo) {
		int result = 0;
		String sql = "INSERT INTO member (id,password,name,email) VALUES(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getEmail());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
		}finally {
			DBClose.close(ps);
		}
		return result;
	}
	//전체회원보기
	public ArrayList<MemberVO> getMemberList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		String sql = "SELECT * FROM member";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
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
	
	//회원 정보변경
	public boolean editMember(MemberVO vo) {
		String sql = "UPDATE member SET id=?,password=?,email=? WHERE name=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
		return true;
		
	}
	
	//회원정보삭제
	public boolean deleteMember(MemberVO vo) {
		String sql = "DELETE from member WHERE id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
		return true;
	}
	
	//회원 아이디 검색
	public ArrayList<MemberVO> getloginID(String id, String password) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		String sql = "select id, password from member where id like '%'||?||'%' "
				+ "and password like '%'||?||'%'";
		MemberVO vo = new MemberVO();
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs=ps.executeQuery();
			while(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
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

	public void close() throws SQLException {
		if(con!=null) {
			if(!con.isClosed())
				con.close();
		}
	}

}
