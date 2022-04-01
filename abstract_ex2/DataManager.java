package abstractex2;

public class DataManager {
	private People[] p = new People[30];
	private int count; //배열의 인덱스 로 사용할 변수
	
	public People[] getP() {
		return p;
	}
	public int getCount() {
		return count;
	}
	public void register() {
		int no = 0;
		outer:
		
		while(true) {
		Menu.subMenu();
		no=DataType.inputInt();
		DataType.inputString(); // 개행문자 처리
		switch(no) {
		case 1: // 학생
			System.out.println("학생 자료 입력");
			Student st = new Student();
			st.inputInfo(); //입력
			addPerson(st);//배열에 저장
			break;
		case 2: //강사
			System.out.println("강사 자료 입력");
			Teacher t = new Teacher();
			t.inputInfo();
			addPerson(t);
			break;
		case 3: // 직원
			System.out.println("직원 자료 입력");
			Staff s = new Staff();
			s.inputInfo();
			addPerson(s);
			break;
		case 4: //상위메뉴
			
			break outer;
		default:
			System.out.println("지원하지 않는 메뉴 번호 !!!");
			break;
		}
	}
		
	}
	public void addPerson(People people) { //People people = st ; --> People people = new Strudent();
		if (count<p.length) {              //People people = t; People people = s;
			p[count++] = people;  //count => 배열 위치의 증가
			System.out.println("1개의 자료가 저장 되었습니다");
			System.out.println("현재저장인원: "+(count+"/"+p.length+"명"));
		}else {
			System.out.println("30명 인원 초과");
		}
	}
	public void search(String name) {
		for(int i = 0; i<count; i++) {
			String pName = p[i].getName(); 	// 배열(객체)에 저장된 이름을 가져오기
			if(name.equals(pName))
				p[i].printAll();
			else
				System.out.println(name+"란 사람은 없음!!!");
			}
	}
	public void remove(String name) {
		for(int i = 0; i<count; i++) {
			String pName = p[i].getName();
			if(name.equals(pName)) {
				for(int j = i; j<count; j++)
					p[j]=p[j+1];
				}
				count--;
				System.out.println(name+"님의 정보가 삭제 됨");
				return;
			}
				System.out.println(name+"님의 정보가 없음");
		}
	
	
	public void printAll() {
		String str = "";
		for(int i = 0; i<count; i++) {
			if(p[i] instanceof Student) // 학생 정보
				str+="\n---학생정보---\n";
			else if(p[i] instanceof Teacher) // 강사 정보
				str+="\n---강사정보---\n";
			else if(p[i] instanceof Staff) // 직원 정보
				str+="\n---직원정보---\n";
			str+=p[i].getInfo();
		}
		System.out.println(str);
		// return str;
	}
}
