package thread_ex;

public class YieldEx {
	public static void main(String[] args) {
		ThreadAA tha = new ThreadAA();
		ThreadBB thb = new ThreadBB();
		tha.start();
		thb.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		tha.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		tha.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		tha.stop = true;
		thb.stop = true;
		
	}
}
