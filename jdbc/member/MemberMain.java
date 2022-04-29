package jdbc.member;

public class MemberMain {
	MemberDAO dao;
	MemberVO vo;
	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
		int sel=0;
		while(true) {
		Menu.showMenu();
		sel = Menu.sc.nextInt();
		Menu.sc.nextLine(); //개행 문자
			switch (sel) {
			case 1:
				mm.inputMember();
				break;
			case 2:
				mm.writeAll();
				break;
			case 3:
				mm.searchName();
				break;
			case 4:
				mm.modifyData();
				break;
			case 5:
				mm.removeData();
				break;
			case 6:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
	}
}
