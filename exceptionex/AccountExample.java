package exceptionex;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account();
		//예금하기
		acc.deposit(10000);
		System.out.println("예금액: "+acc.getBalance());
		//출금하기
		
		try {
			acc.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			System.out.println("예외 메세지: "+e.getMessage());
			// e.printStackTrace();
		}
	}
}
