package jdbc.board;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberManager {
	MemberDAO memberDAO;
	MemberVO memberVO;
	BoardDAO boardDAO;
	BoardVO boardVO;
	
	public MemberManager() {
		memberDAO = new MemberDAO();
		memberVO = new MemberVO();
		boardDAO = new BoardDAO();
		boardVO = new BoardVO();
	}
	
	public void inputMember() {
		//회원가입
		System.out.println("회원 가입");
		System.out.print("아이디: ");
		memberVO.setId(Menu.sc.nextLine());
		System.out.print("패스워드: ");
		memberVO.setPassword(Menu.sc.nextLine());
		System.out.print("이 름: ");
		memberVO.setName(Menu.sc.nextLine());
		System.out.print("이메일: ");
		memberVO.setEmail(Menu.sc.nextLine());
		
		//dao에 있는registerMember()호출
		int res = memberDAO.registerMember(memberVO);
		//데이터 성공 실패 판단
		if(res>0)
			System.out.println("회원 가입 성공");
		else
			System.out.println("회원 가입 실패");
	}
	
	//회원 전체 출력
	public void writeAll() {
		ArrayList<MemberVO> list = memberDAO.getMemberList();
		System.out.println("전체 출력");
		Iterator<MemberVO> it = list.iterator();
		System.out.println("\tID\tPW\tNAME\tEMAIL");
		while(it.hasNext()) {
			memberVO = it.next();
			String str = memberVO.toString();
			System.out.println(str);
		}
	}

	//회원 정보 수정
	public void modifyData() {
		System.out.print("수정할 이름: ");
		memberVO.setName(Menu.sc.nextLine());
		System.out.print("아이디: ");
		memberVO.setId(Menu.sc.nextLine());
		System.out.print("비밀번호: ");
		memberVO.setPassword(Menu.sc.nextLine());
		System.out.print("이메일: ");
		memberVO.setEmail(Menu.sc.nextLine());
		boolean bool = memberDAO.editMember(memberVO);
		if(bool) {
			System.out.println("회원 정보 수정 성공");
		}else
			System.out.println("회원 정보 수정 실패");
	}
	
	//회원 정보 삭제 
	public void removeData() {
		System.out.println("삭제할 아이디: ");
		memberVO.setId(Menu.sc.nextLine());
		boolean bool = memberDAO.deleteMember(memberVO);
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
		ArrayList<MemberVO> list = memberDAO.getlogin(id,pw);
		Iterator<MemberVO> it = list.iterator();
		while(it.hasNext()) {
			memberVO = it.next();
		}
		if(id.equals(memberVO.getId())&&pw.equals(memberVO.getPassword())) {
			System.out.println(memberVO.getId()+"님 로그인 성공");
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
	
	//게시물 작성
		public void newBoard() {
			System.out.println("게시글 작성");
			System.out.print("제목: ");
			boardVO.setTitle(Menu.sc.nextLine());
			System.out.print("내용: ");
			boardVO.setContent(Menu.sc.nextLine());
			System.out.print("작성자: ");
			boardVO.setWriter(memberVO.getId());
			int res = boardDAO.WritePost(boardVO);
			if(res>0)
				System.out.println("게시물이 등록 되었습니다");
			else
				System.out.println("게시물 등록 실패");
		}
		
		//게시물 조회
		public void listBoard() {
			ArrayList<BoardVO> list = boardDAO.ViewAll();
			System.out.println("전체출력");
			Iterator<BoardVO> it = list.iterator();
			while(it.hasNext()) {
				boardVO = it.next();
				String str = boardVO.toString();
				System.out.println(str);
			}
		}
		
		//게시물 변경
		public void editBoard() {
			System.out.println("게시글 수정");
			System.out.print("게시물 작성자: ");
			boardVO.setWriter(Menu.sc.nextLine());
			System.out.print("제목: ");
			boardVO.setTitle(Menu.sc.nextLine());
			System.out.print("내용: ");
			boardVO.setContent(Menu.sc.nextLine());
			boolean bool = boardDAO.EditPost(boardVO);
			if(bool)
				System.out.println("게시물 수정 성공");
			else
				System.out.println("게시물 수정 실패");
		}
		
		//게시물 삭제
		public void deleteBoard() {
			System.out.println("게시글 삭제");
			System.out.print("작성자 이름: ");
			boardVO.setWriter(Menu.sc.nextLine());
			boolean bool = boardDAO.DeletePost(boardVO);
			if(bool)
				System.out.println("게시물 삭제 성공");
			else
				System.out.println("게시물 삭제 실패");
		}
}
