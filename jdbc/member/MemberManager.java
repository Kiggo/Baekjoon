package jdbc.member;

import java.util.Scanner;

public class MemberManager {
	MemberDAO dao;
	MemberVO vo;
	
	public MemberManager() {
		dao=new MemberDAO();
		vo=new MemberVO();
	}
	public void inputMember() {
		//1.자료 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		vo.setId(sc.nextLine()); //String id = sc.nextLine();
		System.out.println("패스워드:");
		vo.setPassword(sc.nextLine()); 
		System.out.print("성 명:");
		vo.setName(sc.nextLine()); 
		System.out.println("이메일");
		vo.setEmail(sc.nextLine()); 
		//vo= new MemberVO(id,pw,name,email);
		//2.dao에 있는 registerMember()호출
		int res=dao.registerMember(vo);
		//3.데이터 성공 실패 판단
		if(res>0)
			System.out.println("데이터 입력 성공");
		else
			System.out.println("데이터 입력 실패");
	}
}
