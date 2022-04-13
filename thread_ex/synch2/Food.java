package thread_ex.synch2;

public class Food {
	public synchronized void receiveOrder(String waitor) {
		for(int i =0; i<5; i++) {
			System.out.println(waitor+"가 주문을 받습니다");
		}
		System.out.println(waitor+"가 주문을 주방에 전달합니다");
		System.out.println();
		notify(); //일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦
		try {
			wait(); //ThreadA를 일시 정지 상태로 만듦
		} catch (InterruptedException e) {}
	}
	
	public synchronized void makeFood(String chef) {
		for(int i = 0; i<5; i++) {
			System.out.println(chef+"이 음식을 만듭니다");
		}
		System.out.println(chef+"이 음식을 홀에 전달합니다");
		System.out.println();
		notify(); //일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦
		try {
			wait(); //ThreadA를 일시 정지 상태로 만듦
		} catch (InterruptedException e) {}
	}
}
