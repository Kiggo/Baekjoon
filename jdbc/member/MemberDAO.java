package jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


//모든 쿼리를 사용할수 있도록 DB연결:공통부분
//Singleton
public class MemberDAO {
	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	public MemberDAO() {
		con=DBSingleton.getInstance();
	}
	
	//회원가입
	public int registerMember(MemberVO vo) {
		int result=0;
		String sql = "INSERT INFO member VALUES(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getEmail());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러:"+e.getMessage());
		}finally {
			DBClose.close(ps);
		}
		return result; 
	}
	//회원 전체 출력
	public ArrayList<MemberVO> getAllList(){
		ArrayList<MemberVO> lists = new ArrayList<MemberVO>();
		String sql = "SELECT * FROM member";
		try {
			ps=con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lists;
		
	}
	//회원 이름 검색
	public ArrayList<MemberVO> getSearchName(String name){
		ArrayList<MemberVO> lists = new ArrayList<MemberVO>();
		
		return lists;
	}
	//회원 정보 변경
	public boolean dditMember(MemberVO vo) {
		
		return true;
	}
	//회원 정보 삭제
	public boolean deleteMember(MemberVO vo) {
		
		return true;
	}
	public void close() throws SQLException {
		if(con!=null) {
			if(!con.isClosed())
				con.close();
		}
	}
	
}
