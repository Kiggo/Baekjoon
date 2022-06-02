package thread_ex.horse;

public class HorseTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Horse(1)); //생성자메소드 안에 작성 Runnable
		Thread t2 = new Thread(new Horse(2)); 
		Thread t3 = new Thread(new Horse(3)); 
		Thread t4 = new Thread(new Horse(4)); 
		Thread t8 = new Thread(new Horse(8)); 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t8.start();

		System.out.println("main()...종료");
	}
}
