package thread_ex.synch00;

public class ConsumerTh extends Thread{
	private DataBuffer dataBuffer;
	
	public ConsumerTh(DataBuffer dataBuffer) {
		this.dataBuffer = dataBuffer;
	}
	
	public void run() {
		for(int i = 1; i<=10; i++) {
			String data = dataBuffer.getData();
			System.out.println("dataBuffer.getDate(): "+data);
		}
	}
}
