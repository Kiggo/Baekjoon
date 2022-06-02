package thread_ex;

public class BeepPrintTest {
	public static void main(String[] args) { //main도 Thread이다
		Thread t = new BeepThread();
		t.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
