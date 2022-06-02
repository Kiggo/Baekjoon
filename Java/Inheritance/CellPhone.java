package Inheritance;

public class CellPhone {
	private String model;
	String color;
	
	//public CellPhone() {}
	public CellPhone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message) {
		System.out.println("본인 : "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "+ message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
