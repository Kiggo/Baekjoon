package thread_ex.synch0;

public class WaitNotifyEx {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); //공유 객체 생성
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject); //ThreadA와 ThreadB생성
		
		threadA.start();
		threadB.start(); //ThreadA와 ThreadB를 실행
	}
}
