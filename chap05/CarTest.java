package chap05;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		//int speed = 60;
		//car.speed = 60;
		//car.company = "기아";
		car.setCompany("기아");
		car.setSpeed(199);
		car.setColor("파란색");
		car.setModel("그렌저");
		car.setMaxSpeed(300);
		car.SpeedUp();
		car.SpeedUp();
		car.SpeedUp();
		car.SpeedUp();
		car.SpeedUp();
		car.SpeedUp();
		
		
		/*
		 * car.SpeedDown(); car.SpeedDown(); car.SpeedDown(); car.SpeedDown();
		 * car.SpeedDown(); car.SpeedDown(); car.SpeedDown();
		 */
		String company = car.getCompany();
		int speed = car.getSpeed();
		String color = car.getColor();
		String model = car.getModel();
		int maxspeed = car.getMaxSpeed();
		
		System.out.println("제조사: "+company);
		System.out.println("속도: "+speed);
		System.out.println("색상: "+color);
		System.out.println("모델: "+model);
		System.out.println("최고속도: "+maxspeed);
	}
}
