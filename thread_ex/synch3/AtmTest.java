package thread_ex.synch3;

public class AtmTest {
	public static void main(String[] args) {
		Atm atm = new Atm();
		
		Thread hong = new Thread(atm,"홍길동");
		Thread lee  = new Thread(atm,"이순신");
		
		hong.start();
		lee.start();
	}
}
