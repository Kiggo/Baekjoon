package jdbc.member;

import java.util.Scanner;

public class Menu {
	public static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.printf("1.사원입력 2.전체검색 3.이름으로 검색 4.정보수정 5.정보삭제 6.종료:");
	}
}
