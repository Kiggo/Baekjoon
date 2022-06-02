package thread_ex;

public class ThreadBB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) { //stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadBB 작업 내용");
			}else {
				Thread.yield(); //work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadBB 종료");
	}
}
