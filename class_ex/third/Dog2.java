package class_ex.third;

public class Dog2 extends Animal2 implements IAnimal{
	
	public Dog2() {
		this.kind="포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍....");
	}
}
