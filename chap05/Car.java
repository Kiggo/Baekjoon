package chap05;

public class Car {
	private String company="현대";
	private String model;
	private String color;
	private int maxSpeed;
	private int speed;
	private int gas;
	final int MAXSPEED=200;
	final int MINSPEED=0;
	/*생성자 메소드
	 *1.클래스 이름과 같다
	 *2.자료 반환형 없다
	 *3.객체를 초기화 --> 필드를 초기화 (자동 초기화)
	*/
	/*
	 * public Car() {//기본 생성자 메소드 System.out.println("생성자 메소드"); company="현대";
	 * color="노란색"; System.out.println("제조사 = "+company);
	 * System.out.println("모델 = "+model); System.out.println("색상 = "+color);
	 * System.out.println("최고속도 = "+maxSpeed); System.out.println("속도 = "+speed); }
	 */
	//속성 메소드로 접근한다 setXXXX(): 자료 저장, 변경 getXXXX(): 값을 읽어옴 
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
		
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	//속도를 올림 (speedUp(), 감속 speedDown(), 정지 stop()메소드 작성
	public void SpeedUp() { //200
		speed+=1;
		if(speed>MAXSPEED)
			speed=200;
	}
	public void SpeedDown() {
		speed-=1;
		if(speed<MINSPEED)
			speed=0;
	}
	public void stop() {
		speed=0;
	}
	public void run(){
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas잔량:"+gas+")");
				gas-=1;
			}else {
				System.out.println("멈춥니다. (gas잔량:"+gas+")");
				return; //메소드 실행종료
			}
		}
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false;
		}else {
			System.out.println("가스가 있습니다.");
			return true;
		}
	}
}
