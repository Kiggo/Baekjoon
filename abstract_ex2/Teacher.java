package abstract_ex2;

public class Teacher extends People {
	private String id; //교번
	private String subject; // 과목
	
	@Override
	void setID(String id) {
		this.id = id;
	}

	@Override
	String getID() {
		return id;
	}

	public String getsubject() {
		return subject;
	}

	public void setsubject(String subject) {
		this.subject = subject;
	}
	
	//강사의 정보를 입력한다
	//1.이름 주소 2. id 교번 subject 과목 입력한다
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("교번 입력: ");
		String i = DataType.inputString();
		setID(i);
		System.out.print("과목 입력: ");
		String c = DataType.inputString();
		setsubject(c);
	}
	
	//강사의 정보를 문자열로 돌려주는 메소드
	@Override
	public String getInfo() {
		String info = super.getInfo()+"\n"+"교번: "+id+"\n"+"학급: "+subject;
		return info;
	}
	
	//강사의 정보를 콘솔에 출력하는 메소드
	@Override
	public void printAll() {
		System.out.println(this.getInfo());
	}

}
