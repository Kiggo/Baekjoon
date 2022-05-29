package jdbc.board;

public class Main {
	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
		BoardManager bm = new BoardManager();
		int sel = 0;
		int num = 0;
		while(true) {
			Menu.showMenu();
			sel = Menu.sc.nextInt();
			Menu.sc.nextLine();
			switch (sel) {
			case 1:
				mm.inputMember();
				break;
			case 2:
				num = mm.login();
				breakOut:
				if(num==1) { //회원로그인
					sel = 0;
					while(true) {
						Menu.boardMenu();
						sel = Menu.sc.nextInt();
						Menu.sc.nextLine();
						switch (sel) {
							case 1:
								//게시물작성
								bm.newBoard();
								break;
							case 2:
								//게시물 전체보기
								bm.listBoard();
								break;
							case 3:
								//게시물 수정
								bm.editBoard();
								break;
							case 4:
								//게시물 삭제
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
				else if(num==2) { // 관리자 로그인
					sel = 0;
					while(true) {
					Menu.memberMenu();
					sel = Menu.sc.nextInt();
					Menu.sc.nextLine();
					switch (sel) {
						case 1:
							//회원전체보기
							mm.writeAll();
							break;
						case 2:
							//회원정보수정
							mm.modifyData();
							break;
						case 3:
							//회원정보삭제
							mm.removeData();
							break;
						case 4:
							bm.newBoard();
							break;
						case 5:
							bm.listBoard();
							break;
						case 6:
							bm.editBoard();
							break;
						case 7:
							bm.deleteBoard();
							break;
						case 8:
							//로그아웃
							System.out.println("로그아웃");
							break breakOut;
						default:
							System.out.println("다시 입력해주세요");
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
