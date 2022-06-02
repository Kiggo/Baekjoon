package thread_ex.join;

public class JoinEx {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); //sumThread가 종료할 때까지 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) {}
		
		System.out.println("1~100 합: " +sumThread.getSum());
	}
}
