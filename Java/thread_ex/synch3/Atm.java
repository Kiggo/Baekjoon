package thread_ex.synch3;

public class Atm implements Runnable{
	private int depositMoney = 10000;

	@Override
	public void run() {
		synchronized(this){
			for(int i = 1; i<=10; i++)
			withDraw(1000);
		}
	}
	public void withDraw(int amount) {
		if(getDepositMoney()>0) {
			depositMoney -= amount;
			System.out.println(Thread.currentThread().getName()+" : ");
			System.out.println("잔액 :"+depositMoney+ "원");
		}else {
			System.out.println(Thread.currentThread().getName()+",");
			System.out.println("잔액 부족합니다");
		}
	}
	public int getDepositMoney() {
		return depositMoney;
	}
	
}
