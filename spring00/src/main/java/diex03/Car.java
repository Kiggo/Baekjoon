package diex03;

public class Car {
	Tire tire; //클래스지만 속성으로 사용하겠다
	
	public Car() {
	}	
	
	public Car(Tire tire) { //생성자 메소드를 통해 전달된다
		this.tire = tire;
	}
	
	public String getTireBrand() {
		
		return "장착된 타이어:"+ tire.getBrand();
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
