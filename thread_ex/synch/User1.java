package thread_ex.synch;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1"); //스레드 이름을 User1로 설정
		this.calculator = calculator; //공유 객체인 Calculator을 필드에 장
	}
	
	public void run() {
		calculator.setMemory(100); //공유 객체인 Calculator의 메모리에 100을 저장
	}

}
