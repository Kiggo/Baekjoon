package class_ex.first;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("1.자료입력 2.종료");
		System.out.print("메뉴 선택:");
	}
	
	public static void menuSel() {
		DistanceSpeedConsole dsc = new DistanceSpeedConsole();
		int sel = 0;
		while(true) {
			Menu.showMenu();
			sel=sc.nextInt();
			switch (sel) {
			case 1:
				dsc.inputData();
				break;
			case 2:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("메뉴 번호는 1,2번 입니다");
				break;
			}
		}
	}
}
