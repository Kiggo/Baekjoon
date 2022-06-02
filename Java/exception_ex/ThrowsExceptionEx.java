package exception_ex;

public class ThrowsExceptionEx {
	public static void main(String[] args) {
		try {
			method1();
		}catch(ArithmeticException e) {}
		catch(Exception e) {
			
		}
	}
	//throws는 예외 처리를 한곳에서 함 
	private static void method1() throws ArithmeticException, Exception {
		//예외 발생
		method2();
	}

	private static void method2() throws Exception {
		//예외 발생
		
	}
}
