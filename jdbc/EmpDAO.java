package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDAO {
	Connection con;
	Statement st;
	PreparedStatement ps; 
	ResultSet rs;
	
	public EmpDAO() {
		con=DBSingleton.getInstance();
	}
	public int insertEmp(EmpVO vo) {
		int result = 0;
		try {
			ps = con.prepareStatement("INSERT INTO emp(empno,ename,job,sal) VALUES(?,?,?,?)");
			ps.setInt(1, vo.getEmpno()); 
			ps.setString(2, vo.getEname());
			ps.setString(3, vo.getJob());
			ps.setDouble(4, vo.getSal()); 
			result=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 에러 : "+e.getMessage());
		}finally {
			DBClose.close(ps);
		}
		return result;
	}
	public ArrayList<EmpVO> searchEmp() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
				String sql = "SELECT * FROM emp";
		try {
			//st=con.createStatement();
			ps=con.prepareStatement(sql);
			//rs=st.executeQuery(sql);
			rs=ps.executeQuery(); 
			while(rs.next()) {
				//rs에 있는 각 칼럼을 접근해서 EmpVO객체화 한다
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));    // int empno =rs.getInt("empno"); EmpVO에 저장한다.. 객체 생성한다
				vo.setEname(rs.getString("ename")); // vo.setEmpno(empno);
				vo.setJob(rs.getString("job"));
				vo.setSal(rs.getDouble("sal"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("DB 에러 : "+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		
		return list;
	}
	public ArrayList<EmpVO> getSearchName(String name){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		String sql = "select * from emp where ename like '%'||?||'%'";
		EmpVO vo;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery(); 
			while(rs.next()) {
				//rs에 있는 각 칼럼을 접근해서 EmpVO객체화 한다
				vo=new EmpVO();
				vo.setEmpno(rs.getInt("empno"));    // int empno =rs.getInt("empno"); EmpVO에 저장한다.. 객체 생성한다
				vo.setEname(rs.getString("ename")); // vo.setEmpno(empno);
				vo.setJob(rs.getString("job"));
				vo.setSal(rs.getDouble("sal"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("DB 에러 : "+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return list;
	}
	public boolean updateEmp(EmpVO vo) {
		
		try {
			String sql ="UPDATE emp SET ename=?,job=?,sal=? WHERE empno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getEname());
			ps.setString(2, vo.getJob());
			ps.setDouble(3, vo.getSal());
			ps.setInt(4, vo.getEmpno());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("회원 정보 변경 실패..."+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
		return true;
	}
	public boolean deleteEmp(EmpVO vo) {
		//int empno=vo.getEmpno();
				//String sql="DELETE FROM emp WHERE EMPNO="+empno+"";
				try {
					//st=con.createStatement();
					ps=con.prepareStatement("DELETE FROM emp WHERE EMPNO=?");
					ps.setInt(1, vo.getEmpno());
					//result=st.executeUpdate(sql);
					ps.executeUpdate();
				} catch (SQLException e) {
					System.out.println("데이터 삭제 실패..."+e.getMessage());
					return false;
				}
				return true;
	}
}
