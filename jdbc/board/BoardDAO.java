package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BoardDAO {
	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	public BoardDAO() {
		con = DBSingleton.getInstance();
	}
		
	//게시물 작성
	public int WritePost(BoardVO vo) {
		int result = 0;
		String sql = "INSERT INTO board (title, content, writer) VALUES(?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
		}
		return result;
	}
	
	//게시물 전체 출력
	public ArrayList<BoardVO> ViewAll() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "SELECT * FROM board";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
		}
		return list;
		
	}
	
	//게시물 변경
	public boolean EditPost(BoardVO vo) {	
		String sql = "UPDATE board SET title=?,content=? WHERE writer=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러 "+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
		return true;
	}
	
	//게시물 삭제
	public boolean DeletePost(BoardVO vo) {
		String sql = "DELETE from board WHERE writer=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getWriter());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러"+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
		return true;
	}
}

