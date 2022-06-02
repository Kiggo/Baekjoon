package interface_ex.default_ex;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassA-mehod1()실행");
	}
	
	@Override
	public void method2() { //디폴트 메소드 재정의
		System.out.println("MyInerface-method2 실행");
	}
}
