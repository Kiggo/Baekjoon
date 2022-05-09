package class_ex.third;

public class MemberService {
	//작성위치
	
	public boolean login(String id, String password) {
		if("hong".equals(id)&&"12345".equals(password))
			return true;
		else
			return false;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
