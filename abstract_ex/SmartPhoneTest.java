package abstractex;

public class SmartPhoneTest {
	public static void main(String[] args) {
	//Phone p = new Phone("aaaa");
	SmartPhone smart = new SmartPhone("홍길동", "octor999");
	smart.turnOn();
	smart.internetSearch();
	smart.turnOff();
	smart.display();
	smart.lcd();
	smart.shape();
	Phone phone = null;
	phone = new SmartPhone("이순신","갤럭시");
	phone.shape();
	
	phoneShape(phone);
	phoneShape(new SmartPhone("이순신", "갤럭시2"));
			
}

	private static void phoneShape(Phone phone) {
		phone.shape();
	}
}
