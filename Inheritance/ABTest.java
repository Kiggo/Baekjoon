package Inheritance;

public class ABTest {
	public static void main(String[] args) {
		B b = new B();
		b.field1 = 1000;
		b.method1();
		b.field2 = "클래스 B";
		b.method2();
		A a = new A();
		a.field1 = 2000;
		a.method1();
	}
}
