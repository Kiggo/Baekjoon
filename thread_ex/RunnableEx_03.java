package thread_ex;

class MyRunnable2 implements Runnable{
	String name;
	public MyRunnable2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 10; i>=0; i--) {
			System.out.println(this.name+i+" ");
		}
	}
	
}
public class RunnableEx_03 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable2("Thread_A "));
		Thread t2 = new Thread(new MyRunnable2("Thread_B "));
		
		t1.start();
		t2.start();
	}
}
