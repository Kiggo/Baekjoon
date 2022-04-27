package jdbc;

public class EmpMain {
	public static void main(String[] args) {
		//메뉴 선택 만들기
		Menu menu = new Menu();
		EmpDAO dao = new EmpDAO();
		EmpVO vo = new EmpVO();
		EmpManager em = new EmpManager();
		int sel=0;
		while(true) {
			menu.showMenu();
			sel=menu.sc.nextInt();
			menu.sc.nextLine();
			switch (sel) {
			case 1:
				System.out.println("회원가입");
				dao.insertEmp(vo);
				em.inputData();
				break;
			case 2:
				System.out.println("전체출력");
				em.writeAll();
				break;
			case 3:
				System.out.println("이름으로 검색");
				em.searchName();
				break;
			case 4:
				System.out.println("정보수정");
				dao.updateEmp(vo);
				em.modifyData();
				break;
			case 5:
				System.out.println("정보삭제");
				dao.deleteEmp(vo);
				em.removeDate();
				break;
			case 6:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("메뉴 번호 잘못 입력 함");
				break;
			}
			}
	}
}
