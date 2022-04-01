package abstractex;

public abstract class Phone {
	//필드
	protected String owner;
	protected String processor;
	
	//생성자
	public Phone(String owner, String processor) {
		this.owner = owner;
		this.processor = processor;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	abstract void lcd();
	abstract void shape();
}
