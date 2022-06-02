package class_ex.first;

public class DistanceSpeed {
	private int distance;
	private int speed;
	public DistanceSpeed() {}
	public DistanceSpeed(int distance, int speed) {
		setDistance(distance);
		setSpeed(speed);
	}
	//속성 메소드 정의
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "DistanceSpeed [distance=" + distance + ", speed=" + speed + "]";
	}
	
	public int hour(int x, int y) {
		int hour = Calculator.hour(x, y);
		return hour;
	}
	
	public int over(int x, int y) {
		int over = Calculator.over(x, y);
		return over;
	}
	
}
