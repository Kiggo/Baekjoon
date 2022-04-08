package thread_ex.horse;

public class Horse implements Runnable {
	int horse_num;
	public Horse(int horse_num) {
		this.horse_num = horse_num;
	}
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println(horse_num+"번 말이 "+100*i+"미터 도착");
			if(horse_num==8&&i==5) {
				System.out.println("8번 말 yield()...");
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}//end for
	}
	
}
