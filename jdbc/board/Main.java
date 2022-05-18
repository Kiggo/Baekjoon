package jdbc.board;

public class Main {
	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
		BoardManager bm = new BoardManager();
		int sel = 0;
		while(true) {
			Menu.showMenu();
			sel = Menu.sc.nextInt();
			Menu.sc.nextLine();
			switch (sel) {
			case 1:
				mm.inputMember();
				break;
			case 2:
				mm.writeAll();
				mm.loginID();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
			default:
				break;
			}
		}
	}
}
