package chap05;

public class CarTestGas {
	public static void main(String[] args) {
		Car car = new Car();
		car.setGas(5);
		boolean gasState = car.isLeftGas(); // 가스 주입 여부
		
		if(gasState) { //if(true)
			System.out.println("출발합니다");
			car.run();
		}
		
		if(car.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
		
	}

}
