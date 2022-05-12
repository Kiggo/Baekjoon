package class_ex.anonymous;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		an.field.wake();
		an.method1();
		an.method2(new Person() {
			void study() {
				System.out.println("공부한다");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어남");
				study();
			}
			
		});
	}
}
