package abstract_ex2;

public abstract class People {
	String name;
	String address;
	public People() {super();} //this("","")
	public People(String name, String address) {
		setName(name);       // this.name = name;
		setAddress(address); // this.address = address;
	}
	
	//속성 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	abstract void setID(String id); // 추상 메소드
	abstract String getID();
	public void inputInfo() {
		System.out.print("이름 입력: ");
		String nm = DataType.inputString();
		if(nm.startsWith("폰"))
			System.out.println("폰 씨는 등록할 수 없음"); // 예외로 변경
		setName(nm);
		System.out.print("주소 입력: ");
		String address = DataType.inputString();
		setAddress(address);
		}
	//사람의 정보를 문자열로 돌려주는 메소드
	public String getInfo() {
		String info = "\n"+"이름: "+name+"\n"+"주소: "+address;
		return info;
	}
	
	//사람의 정보를 콘솔에 출력하는 메소드
	public void printAll() {
		System.out.println(this.getInfo());
	}
	public String toString() {
		return name;
	}
	
}
