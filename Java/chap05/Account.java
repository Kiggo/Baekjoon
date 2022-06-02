package chap05;

public class Account {
	private int accountNumber;//계좌번호
	private double ballance;//잔고
	//생성자 overloading (중복 메소드) 
	public Account() {this(0,0.0);} //기본 생성자 메소드
	
	public Account(int accNum) {
		this(accNum, 0.0);
		//setAccountNumber(accNum);
		//accountNumber=accNum;
	}
	
	public Account(int accNum,double ballance) {
		setAccountNumber(accNum); 	//accountNumber=accNum;
		setBallance(ballance); 		//this.ballance=ballance;

	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setBallance(double ballance) {
		this.ballance = ballance;
	}
	public double getballance() {
		return ballance;
	}
	//입금 메소드
	public void deposit(int amount) {
		ballance+=amount;
	}
	//출금 메소드
	public void withdraw(int amount) {
		if(amount>ballance) 
			System.out.println("오류: 잔고부족");
		
		else 
			ballance-=amount;
		
	}
}
			

