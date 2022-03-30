package abstractex2;

public class Menu {
	public static void mainMenu() {
		System.out.println("----------Main Menu----------");
		System.out.println("1.등록  2.검색  3.삭제  4.출력  5.종료");
		System.out.println("-----------------------------");
		System.out.print("메뉴 번호 입력: ");
	}
	public static void subMenu() {
		System.out.println("----------Sub Menu----------");
		System.out.println("1.학생 2.강사 3.직원 4.상위메뉴");
		System.out.println("----------------------------");
		System.out.print("메뉴 번호 입력: ");
	}
}
