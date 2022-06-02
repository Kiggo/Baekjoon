package interface_ex.tire;

public class Car { // 전체는 부분에 의존한다
	
/*	ITire frontLeftTire = new HankookTire();
	ITire frontRightTire = new HankookTire();
	ITire backLeftTire = new HankookTire();
	ITire backRightTire = new HankookTire();
*/	
	ITire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
/*		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
*/
		for(ITire tire : tires) {
			tire.roll();
		}
	}
	
}
