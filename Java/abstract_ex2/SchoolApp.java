package abstract_ex2;

import java.util.InputMismatchException;

public class SchoolApp {
	public static void main(String[] args) {
		DataManager dm = new DataManager();
		boolean bool = false;
		int no = 0;
		while(true) {
			//1.메뉴 호출
			//2.메뉴 입력
			do {
				try {
					Menu.mainMenu();
					no = DataType.inputInt();
					DataType.inputString(); // 개행 문자 처리
					bool = false;
				}catch(InputMismatchException e) {
					System.out.println("숫자를 입력하세요!!!");
					DataType.inputString();
					bool = true;
					
				}
			}while(bool); // 문자 , 문자열이 입력하면 다시 입력: true , 정수형 숫자 false
			//3. switch 사용
			switch(no){
				case 1:
					System.out.println("등록");
					dm.register();
					break;
				case 2: 
					System.out.println("조회");
					System.out.print("검색할 사람 ==> ");
					String name = DataType.inputString();
					dm.search(name);
					break;
				case 3:
					System.out.println("삭제");
					System.out.print("삭제할 사람 ==> ");
					name = DataType.inputString();
					dm.remove(name);
					break;
				case 4:
					System.out.println("출력");
					dm.printAll();
					break;
				case 5:
					System.out.println("5.종료");
					System.exit(0); 
				default:
					System.out.println("지원하지 않는 메뉴 번호입니다!!");
					break;
					
			}
			
				
		}
	}
}
