package Inheritance.tire;

public class Tire {
	protected int maxRotation;
	protected int accumlateRotation;
	protected String location;
	
	public Tire(String location, int maxRotation) { // 생성자 메소드 자기 자신 상속되지 않는다
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		System.out.println("roll().....");
		++accumlateRotation;
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"Tire 수명: "+(maxRotation-accumlateRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+ location + " Tire 펑크 ***");
			return false;
		}
	}
}
