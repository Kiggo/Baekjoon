package thread_ex.synch00;

public class ShareTest {
	public static void main(String[] args) {
		
		DataBuffer dataBuffer = new DataBuffer();
		
		ProducerTh pth = new ProducerTh(dataBuffer);
		ConsumerTh cth = new ConsumerTh(dataBuffer);
		
		pth.start();
		cth.start();
	}
}
