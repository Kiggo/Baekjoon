package interface_ex.default_ex;

public interface MyInterface {
	public void method1();
	
	public default void method2() { //디폴트 메소드
		System.out.println("MyInerface-method2 실행");
	}
}
