package exception_ex;

public class NullPointerExceptionEX {
	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료!!!!");
	}
	
}
