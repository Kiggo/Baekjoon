package jdbc.member;

import java.sql.SQLException;

public class MemberTest {
	public static void main(String[] args) throws SQLException {
		MemberVO vo = new MemberVO();
		MemberVO vo2 = new MemberVO("korea", "koea", "korea", "koea");
		System.out.println(vo.toString());
		System.out.println(vo2.toString());
		//생성한 객체에서 속성 변경
		vo2.setPassword("korea");
		vo2.setEmail("korea");
		System.out.println(vo2.toString());
		
		String id = vo2.getId();
		String password = vo2.getPassword();
		String name = vo2.getName();
		System.out.printf("%10s %10s %10s\n",id , password, name);
		
		MemberDAO dao = new MemberDAO();
		dao.close();
	}
}
