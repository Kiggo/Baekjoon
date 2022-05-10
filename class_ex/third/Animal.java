package class_ex.third;

public abstract class Animal {
	String kind;
	public void breath() {
		System.out.println("숨을 쉽니다");
	}
	abstract void sound();
}
