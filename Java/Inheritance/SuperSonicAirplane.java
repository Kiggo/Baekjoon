package Inheritance;

public class SuperSonicAirplane extends Airplane{
	public static final int NORMAL = 1 ;
	public static final int SUPERSONIC = 2 ;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC)
		System.out.println("초음속 비행합니다");
		else
			super.fly();  // super는 상속 받은 곳에서 얼마든지 쓸 수 있다.
	}
}
