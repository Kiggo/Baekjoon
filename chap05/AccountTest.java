package chap05;

public class AccountTest {
	public static void main(String[] args) {
		Account acc0 = new Account();
		Account acc1 = new Account(101);
		Account acc2 = new Account(102,30000);
		
		acc0.setAccountNumber(000);
		acc0.setBallance(10000);
		acc0.deposit(80000);
		System.out.println("계좌번호: "+acc0.getAccountNumber()+" , 잔고: "+acc0.getballance());
		

		acc1.setBallance(5000);
		System.out.println("계좌번호: "+acc1.getAccountNumber()+" , 잔고: "+acc1.getballance());
		acc1.deposit(1000);
		System.out.println("계좌번호: "+acc1.getAccountNumber()+" , 잔고: "+acc1.getballance());
		
		System.out.println("계좌번호: "+acc2.getAccountNumber()+" , 잔고: "+acc2.getballance());
		acc2.withdraw(5000);
		System.out.println("계좌번호: "+acc2.getAccountNumber()+" , 잔고: "+acc2.getballance());
		acc2.withdraw(45000);
		System.out.println("계좌번호: "+acc2.getAccountNumber()+" , 잔고: "+acc2.getballance());
		
		
	}

}
