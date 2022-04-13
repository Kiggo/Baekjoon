package lambda_ex;

public class MyInterfaceTest {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = new MyInterface();
		mfi.method();
		MyInterface my2 = (MyInterface)mfi; //다운캐스팅
		if(mfi instanceof MyInterface) {
			my2.printLine();
		}
		
		//MyFunctionalInterface mfi2 = new MyFunctionalInterface(); 접근 불가
		MyInterface my = new MyInterface();
		my.method();
		my.printLine();
	}
}
