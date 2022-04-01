package abstractex2;

public class Student extends People{
	private String id; //학번
	private String className; //학급
	
	@Override
	void setID(String id) {
		this.id = id;
	}

	@Override
	String getID() {
		return id;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	//학생의 정보를 입력한다
	//1.이름 주소 2.id 학번 학급 입력한다
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("학번 입력: ");
		String i = DataType.inputString();
		setID(i);
		System.out.print("학급 입력: ");
		String c = DataType.inputString();
		setClassName(c);
	}

	//학생의 정보를 문자열로 돌려주는 메소드
	@Override
	public String getInfo() {
		String info = super.getInfo()+"\n"+"학번: "+id+"\n"+"학급: "+className;
		return info;
	}
	
	//학생의 정보를 콘솔에 출력하는 메소드
	@Override
	public void printAll() {
		System.out.println(this.getInfo());
	}
	

}
