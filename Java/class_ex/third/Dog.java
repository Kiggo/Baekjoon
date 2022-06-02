package class_ex.third;

public class Dog extends Animal {
	
	public Dog() {
		this.kind="포유류";
	}
	
	@Override
	void sound() {
		System.out.println("멍멍...");
	}
}
