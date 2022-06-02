package class_ex.third;

public class Cat2 extends Animal2 implements IAnimal{
	
	public Cat2() {
		this.kind="포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹 야옹...");
	}
}
