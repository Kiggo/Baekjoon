package Inheritance.tire;

public class CarExample {
	public static void main(String[] args) {
	/*HankookTire ht = new HankookTire("앞왼쪽", 15);
	ht.roll();
	Tire tire = new HankookTire("앞오른쪽",7); 
	tire.roll();
	tire = new KumhoTire("앞오른쪽", 7); // upcasting
	tire.roll();
	// KumhoTire k = new KumhoTire(null, 0);
	KumhoTire kumho = (KumhoTire) tire; // 파생 클래스 = (파생 클래스) 부모클래스 downcasting 5번과 같음
	kumho.shape();*/
	Car car = new Car();
	for(int i = 1; i<=5; i++) {
	int problemLocation = car.run(); // 타이어 위치 1에서 4까지 
		/*switch (problemLocation) {
		case 1:
			System.out.println("앞왼쪽  HankookTire로 교체"); // 앞왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체"); // 앞오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
			car.frontRightTire = new KumhoTire("앞오른쪽", 13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체"); // 뒤왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
			car.backLeftTire = new HankookTire("뒤왼쪽", 14);
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로교체"); // 뒤오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
			car.backRightTire = new KumhoTire("뒤오른쪽", 17);*/
		if(problemLocation !=0) {
			System.out.println(car.tires[problemLocation-1].location+"HankookTire로 교체");
			car.tires[problemLocation-1] = 
					new HankookTire(car.tires[problemLocation-1].location, 15);
		}
		System.out.println("------------------------------------"); //1회전시 출력되는 내용을 구분
	}
	}
}
