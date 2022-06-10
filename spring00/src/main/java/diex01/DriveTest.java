package diex01;

public class DriveTest {
	public static void main(String[] args) {
		//Tire tire = new KumhoTire();
		//1.매개변수로 타이어를 전달
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		String res = car.getTireBrand();
		System.out.println(res);
		
		//2.생성자 메소드를 통한 타이어 전달
		Car car1 = new Car();//각 타이어 제조사 이름을 출력하시오
		System.out.println(car1.getTireBrand());
		//한국 타이어를 출력
	}
}
