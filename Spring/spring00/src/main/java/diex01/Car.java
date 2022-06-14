package diex01;

public class Car {
	Tire tire;
	
	public Car() {
		//tire = new KumhoTire();
		tire = new HankookTire();
	}	
	
	public Car(Tire tire) { //생성자 메소드를 통해 전달된다
		this.tire = tire;
	}
	
	public String getTireBrand() {
		
		return "장착된 타이어:"+ tire.getBrand();
	}
	
}
