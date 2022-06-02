package method;

public class StaticEx {
	int field1;
	void method1() {}
	static int field2;
	static void method2() {}
	
	static {
		field2=100;
		method2();
	}
	
	static void method3() {
		field2=1000;
	}
	
	public static void main(String[] args) {
		StaticEx se = new StaticEx();
		se.field1 = 1000;
		se.method1();
	}
}
