package thread_ex;

class MyThread extends Thread{

}
public class ThreadEx_01 {
	public static void main(String[] args) {
		System.out.println("여기는 main()...");
		Thread t = new MyThread();
		t.start();
	}
}
