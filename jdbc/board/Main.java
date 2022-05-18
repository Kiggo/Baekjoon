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
				breakOut:
				if(mm.login()==true) {
					int sel2 = 0;
					while(true) {
						Menu.boardMenu();
						sel2 = Menu.sc.nextInt();
						Menu.sc.nextLine();
						switch (sel2) {
						case 1:
							bm.newBoard();
							break;
						case 2:
							bm.listBoard();
							break;
						case 3:
							bm.editBoard();
							break;
						case 4:
							bm.deleteBoard();
							break;
						case 5:
							System.out.println("로그아웃");
							break breakOut;
						default:
							System.out.println("다시 입력하세요.");
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
	}
}
