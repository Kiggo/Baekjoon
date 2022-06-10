package diex02;

public class DriveTest {
	public static void main(String[] args) {
		//3.set메소드로 타이어를 전달
		//Tire tire = new KumhoTire();
		Tire tire = new HankookTire();
		tire = new KumhoTire();
		Car car = new Car();
		car.setTire(tire);
		String res = car.getTireBrand();
		System.out.println(res);
		
		
	}
}
