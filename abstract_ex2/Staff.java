package abstract_ex2;

public class Staff extends People{
	private String id; //사번
	private String dept; //부서
	
	@Override
	void setID(String id) {
		this.id = id;
	}
	
	@Override
	String getID() {
		return id;
	}

	public String getdept() {
		return dept;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}
	
	//직원의 정보를 입력한다
	//1.이름 주소 2. id 사번 dept 부서 입력한다
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("사번 입력: ");
		String i = DataType.inputString();
		setID(i);
		System.out.print("부서 입력: ");
		String c = DataType.inputString();
		setdept(c);
		
	}

	//직원의 정보를 문자열로 돌려주는 메소드
	@Override
	public String getInfo() {
		String info = super.getInfo()+"\n"+"사번: "+id+"\n"+"부서: "+dept;
		return info;
	}

	//직원의 정보를 콘솔에 출력하는 멧도ㅡ
	@Override
	public void printAll() {
		System.out.println(this.getInfo());
	}
	
}
