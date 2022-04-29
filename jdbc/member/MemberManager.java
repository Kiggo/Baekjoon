package jdbc.member;

import java.util.ArrayList;
import java.util.Iterator;
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
		System.out.print("패스워드:");
		vo.setPassword(sc.nextLine()); 
		System.out.print("성 명:");
		vo.setName(sc.nextLine()); 
		System.out.print("이메일");
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
	public void writeAll() {
		ArrayList<MemberVO> lists = dao.getAllList();
		System.out.println("전체 출력");
		//반복자 사용 : Iterator
		Iterator<MemberVO> it = lists.iterator();
		while(it.hasNext()) {
			/*
			String id = vo.getId();
			String pw = vo.getPassword();
			String name = vo.getName();
			String email = vo.getEmail();
			*/
			vo = it.next();
			String str = vo.toString();
			System.out.println(str);
		}
	}
	public void searchName() {
		System.out.print("이름 입력: ");
		String name = Menu.sc.nextLine();
		ArrayList<MemberVO> lists = dao.getSearchName(name);
		Iterator<MemberVO> it = lists.iterator();
		while(it.hasNext()) {
			vo = it.next();
			String str = vo.toString();
			System.out.println(str);
			if(lists.size()==0)
				System.out.println("찾고자하는 데이터 없음");
		}
	}
	public void modifyData() {
		System.out.print("사원 이름: ");
		vo.setName(Menu.sc.nextLine());
		System.out.print("아이디: ");
		vo.setId(Menu.sc.nextLine());
		System.out.print("비밀번호: ");
		vo.setPassword(Menu.sc.nextLine());
		System.out.print("이메일: ");
		vo.setEmail(Menu.sc.nextLine());
		boolean bool = dao.dsitMember(vo);
		if(bool)
			System.out.println("사원 정보 수정 성공");
		else
			System.out.println("사원 정보 수정 실패");
	}
	
	public void removeData() {
		System.out.println("삭제할 아이디");
		vo.setId(Menu.sc.nextLine());
		boolean bool = dao.deleteMember(vo);
		if(bool)
			System.out.println("데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	}
}
