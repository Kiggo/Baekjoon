package thread_ex.synch00;

public class ProducerTh extends Thread{
	private DataBuffer dataBuffer;
	
	public ProducerTh(DataBuffer dataBuffer) {
		super("producerThread!!!!!!!");
		this.dataBuffer = dataBuffer;
	}
	public void run() {
		for (int i = 1; i <=10; i++) {
			String data = "Data - "+i;
			System.out.println("dataBuffer.setData("+data+")호출" );
			dataBuffer.setData(data);
		}
	}
}
