package Inheritance.tire;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // 상속되지 않았기 때문에 부모 생성자 메소드를 호출한다
		
	}
	public boolean roll() {
		System.out.println("HankookTire...");
		++accumlateRotation;
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명: "+(maxRotation-accumlateRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+ location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
}