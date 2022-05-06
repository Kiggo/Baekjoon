package method;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		boolean gasState = myCar.isLeftGas();
		System.out.println("결과: "+gasState);
		myCar.setGas(1500);
		gasState = myCar.isLeftGas();
		System.out.println("결과: "+gasState);
		if(gasState) {
			System.out.println("차가 출발합니다");
			myCar.run();
		}
		if(myCar.isLeftGas())
		System.out.println("gas를 주입할 필요가 없음.");
		else
		System.out.println("gas를 주입하세요.");
	}
}
