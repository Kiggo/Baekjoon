package thread_ex.synch;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2"); //스레드 이름을 User2로 설정
		this.calculator = calculator; //공유 객체인 Calculator을 필드에 저장
	}
	
	public void run() {
		calculator.setMemory(50); //공유 객체인 Calculator의 메모리에 50을 저장
	}
}
