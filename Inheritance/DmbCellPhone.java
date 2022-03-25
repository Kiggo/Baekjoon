package Inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	//public DmbCellPhone() {super();}
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color);
		//this.setModel(model);
		//this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널 : "+channel+"번 DMB 방송 수신");
	}
	void changeChannerDmb(int channel) {
		this.channel = channel;
		System.out.println("채널: "+channel+"번호로 바뀜");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈췄습니다");
	}
	
}
