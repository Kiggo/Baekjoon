package jdbc.board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberManager {
	MemberDAO dao;
	MemberVO vo;
	BoardVO bvo;
	
	public MemberManager() {
		dao = new MemberDAO();
		vo = new MemberVO();
		bvo = new BoardVO();
	}
	
	public void inputMember() {
		//회원가입
		System.out.println("회원 가입");
		System.out.print("아이디: ");
		vo.setId(Menu.sc.nextLine());
		System.out.print("패스워드: ");
		vo.setPassword(Menu.sc.nextLine());
		System.out.print("이 름: ");
		vo.setName(Menu.sc.nextLine());
		System.out.print("이메일: ");
		vo.setEmail(Menu.sc.nextLine());
		
		//dao에 있는registerMember()호출
		int res = dao.registerMember(vo);
		//데이터 성공 실패 판단
		if(res>0)
			System.out.println("회원 가입 성공");
		else
			System.out.println("회원 가입 실패");
	}
	
	//회원 전체 출력
	public void writeAll() {
		ArrayList<MemberVO> list = dao.getMemberList();
		System.out.println("전체 출력");
		Iterator<MemberVO> it = list.iterator();
		System.out.println("\tID\tPW\tNAME\tEMAIL");
		while(it.hasNext()) {
			vo = it.next();
			String str = vo.toString();
			System.out.println(str);
		}
	}

	//회원 정보 수정
	public void modifyData() {
		System.out.print("수정할 이름: ");
		vo.setName(Menu.sc.nextLine());
		boolean bool = dao.editMember(vo);
		if(bool) {
			System.out.print("아이디: ");
			vo.setId(Menu.sc.nextLine());
			System.out.print("비밀번호: ");
			vo.setPassword(Menu.sc.nextLine());
			System.out.print("이메일: ");
			vo.setEmail(Menu.sc.nextLine());
			System.out.println("회원 정보 수정 성공");
		}else
			System.out.println("회원 정보 수정 실패");
	}
	
	//회원 정보 삭제 
	public void removeData() {
		System.out.println("삭제할 아이디: ");
		vo.setId(Menu.sc.nextLine());
		boolean bool = dao.deleteMember(vo);
		if(bool)
			System.out.println("회원정보 삭제 성공");
		else
			System.out.println("회원정보 삭제 실패");
	}
	
	//로그인
	public int login() {
		System.out.print("아이디: ");
		String id = Menu.sc.nextLine();
		System.out.print("비밀번호: ");
		String pw = Menu.sc.nextLine();
		ArrayList<MemberVO> list = dao.getlogin(id,pw);
		Iterator<MemberVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
		}
		if(id.equals(vo.getId())&&pw.equals(vo.getPassword())) {
			System.out.println(vo.getId()+"님 로그인 성공");
			bvo.setWriter(id);
			return 1;
		}
		else if(id.equals("admin")&&pw.equals("admin")) {
			System.out.println("관리자 로그인 성공");
			return 2;
		}
		else {
			System.out.println("로그인실패");
			return 0;
		}
	}
}
