package abstractex;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner,String processor) {
		super(owner, processor);
		
	}
	
	//메소드
	/*public void turnOn() {
		super.turnOn();
		System.out.println("SmartPhone 켭니다.");  
	}*/
	public void internetSearch() {
		System.out.println("인터넷 검색 기능..");
	}
	public void display() {
		System.out.println(owner+"의 스마트 폰");
	}
	
	@Override
	void lcd() {
		System.out.println("oled다");
		
	}

	@Override
	void shape() {
		System.out.println("폴더 형이다");
		
	}   
}
