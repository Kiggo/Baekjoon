package class_ex.third;

public class AnimalMain2 {
	public static void main(String[] args) {
		IAnimal ia = null;
		ia = new Dog2();
		ia.sound();
		ia = new Cat2();
		ia.sound();
		
		animalSound(new Dog2());
		animalSound(new Cat2());
	}

	private static void animalSound(IAnimal ia) {
		ia.sound();
		
	}

	
}
