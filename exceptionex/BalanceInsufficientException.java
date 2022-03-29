package exceptionex;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {} //생성자메소드
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
