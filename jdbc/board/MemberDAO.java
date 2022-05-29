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
	
	//회원정보변경
	public boolean editMember(MemberVO vo) {
		int cnt;
		String sql = "UPDATE member SET id=?,password=?,email=? WHERE name=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getName());
			cnt=ps.executeUpdate();
			if(cnt>0) {
				System.out.println(vo.getName()+"수정성공");
				return true;
			}else {
				System.out.println("이름을 찾을 수 없습니다");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
	}
	
	//회원정보삭제
	public boolean deleteMember(MemberVO vo) {
		int cnt;
		String sql = "DELETE from member WHERE id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			cnt=ps.executeUpdate();
			if(cnt>0) {
				System.out.println(vo.getId()+"삭제성공");
				return true;
			}else {
				System.out.println("아이디를 찾을 수 없습니다.");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("DB 에러 "+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
	}
	
	//로그인 아이디 비밀번호
	public ArrayList<MemberVO> getlogin(String id, String password) {
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
