package thread_ex;

class MyRunnable implements Runnable{

@Override
	public void run() {
		for(int i = 10; i>=0; i--)
			System.out.print(i+" ");
	}	
}

public class RunnableEx_02 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable()); 
		t.start();
	}
}