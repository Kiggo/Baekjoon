package jdbc.board;

import java.util.ArrayList;
import java.util.Iterator;

public class BoardManager {
	BoardDAO dao;
	BoardVO vo;
	
	public BoardManager() {
		dao = new BoardDAO();
		vo = new BoardVO();
	}
	
	//게시물 작성
	public void newBoard() {
		System.out.println("게시물 작성");
		System.out.print("제목: ");
		vo.setTitle(Menu.sc.nextLine());
		System.out.print("내용: ");
		vo.setContent(Menu.sc.nextLine());
		System.out.print("작성자: ");
		vo.setWriter(null);
		int res = dao.WritePost(vo);
		if(res>0)
			System.out.println("게시물이 등록 되었습니다");
		else
			System.out.println("게시물 등록 실패");
	}
	
	//게시물 조회
	public void listBoard() {
		ArrayList<BoardVO> list = dao.ViewAll();
		System.out.println("전체출력");
		Iterator<BoardVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			String str = vo.toString();
			System.out.println(str);
		}
	}
	
	//게시물 변경
	public void editBoard() {
		System.out.println("게시물 변경");
		System.out.print("게시물 작성자: ");
		vo.setWriter(Menu.sc.nextLine());
		System.out.print("제목: ");
		vo.setTitle(Menu.sc.nextLine());
		System.out.print("내용: ");
		vo.setContent(Menu.sc.nextLine());
		boolean bool = dao.EditPost(vo);
		if(bool)
			System.out.println("게시물 수정 성공");
		else
			System.out.println("게시물 수정 실패");
	}
	
	//게시물 삭제
	public void deleteBoard() {
		System.out.println("게시물 삭제");
		System.out.print("작성자 이름: ");
		vo.setWriter(Menu.sc.nextLine());
		boolean bool = dao.DeletePost(vo);
		if(bool)
			System.out.println("게시물 삭제 성공");
		else
			System.out.println("게시물 삭제 실패");
	}
}
