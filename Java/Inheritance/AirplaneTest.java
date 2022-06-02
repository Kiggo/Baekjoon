package Inheritance;

public class AirplaneTest {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC; // sa.flyMode = 2
		sa.fly();
		sa.flyMode = SuperSonicAirplane.NORMAL; // sa.flyMode = 2
		sa.fly();
		sa.land();
	}
}
