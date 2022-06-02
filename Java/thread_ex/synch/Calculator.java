package thread_ex.synch;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	//synchronized 를 통해 Calculator객체 잠금
	public /*synchronized*/ void setMemory(int memory) { //계산기 메모리에 값을 저장하는 메소드
		synchronized(this) {
		this.memory = memory; //매개값을 memory 필드에 저장
		try {
			Thread.sleep(2000); //스레드를 2초간 일시 정지시킴 java.lang.* : 기본적으로 제공
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
		                          //현재 실행중인 스레드의 이름                        //메모리 값
	}
}
}
