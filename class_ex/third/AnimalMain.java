package class_ex.third;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		/////////////////////
		//Animal an = new Animal();
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}
}
