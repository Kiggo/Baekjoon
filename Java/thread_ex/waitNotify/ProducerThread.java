package thread_ex.waitNotify;

public class ProducerThread extends Thread{
	private DataBox databox;
	
	public ProducerThread(DataBox databox) {
		this.databox = databox; //공유 객체를 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=3; i++) {
			String data = "Data-"+i;
			databox.setData(data); //새로운 데이터를 저장
		}
	}
}
