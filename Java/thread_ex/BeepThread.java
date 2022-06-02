package thread_ex;

import java.awt.Toolkit;

public class BeepThread extends Thread{ // Thread 상속을 주어야한다

	@Override
	public void run() {
		//Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			//tool.beep();
			System.out.println("beep beep beep...");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
