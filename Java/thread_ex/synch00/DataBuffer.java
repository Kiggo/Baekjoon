package thread_ex.synch00;

public class DataBuffer {
	private String data;
	
	public synchronized String getData() {//data을 읽음
		if(this.data==null) {//data가 없음
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String resData = data;
		System.out.println("읽어온 데이터: "+resData);
		data = null;
		System.out.println(Thread.currentThread().getName()+"notify()호출");
		notify();
		return resData;
	}
	//data가 null일 경우 자료 생성함
	public synchronized void setData(String data) {
		//이미 데이터가 있을 때 할 일 없음 --> wait()
		if(this.data!=null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		//data==null이기 때문에 파라미터로 받은 값으로 저장
		this.data = data;
		System.out.println("저장된 데이터: "+this.data);
		System.out.println(Thread.currentThread().getName()+"notify()호출");
		notify();
	}
}
