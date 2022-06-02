package Hello;
//Thread 클래스를 상속한 NumberThread 클래스 생성
class NumberThread extends Thread{
	public void run() { // start 메소드로 호출
		// 0 부터 49까지 출력
		for (int i = 0; i < 50; i++) {
			System.out.print(i);
		}
	}
}
//Thread 클래스를 상속한 CharThread 클래스 생성
class CharThread extends Thread{
	public void run() { // start 메소드로 호출
		// a부터 z까지 출력
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
	}
}
public class JAVA_15 {
	public static void main(String[] args) {
		//NumberThread 클래스 인스턴스 생성
		Thread thread1 = new NumberThread();
		//CharThread 클래스 인스턴스 생성
		Thread thread2 = new CharThread();
		
		thread1.start(); // NumberThread 시작 (run 메소드 호출)
		thread2.start(); // CharThread 시작 (run 메소드 호출)
	}
}