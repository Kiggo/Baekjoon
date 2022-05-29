package jdbc.board;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("1.회원가입 2.로그인 3.종료");
	}
	public static void memberMenu() {
		System.out.println("1.회원전체보기 2.회원정보수정 3.회원정보삭제 4.게시물작성 5.게시판전체보기 6.게시물수정 7.게시물삭제 8.로그아웃");
	}
	public static void boardMenu() {
		System.out.println("1.게시물작성 2.게시판전체보기 3.게시물수정 4.게시물삭제 5.로그아웃");
	}
}