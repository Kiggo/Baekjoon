package Inheritance.tire;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	public boolean roll() {
		System.out.println("Kumho Tire...");
		++accumlateRotation;
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명: "+(maxRotation-accumlateRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+ location + " HankookTire 펑크 ***");
			return false;
		}
	}
	public void shape() {
		System.out.println("tire shape...");
	}
}
