package interface_ex.vehicle;

public class Taxi implements Vehicle { //접점이같다 = 부모에게받은 상속

	@Override
	public void run() {
		System.out.println("택시가 달림");
	}

}
