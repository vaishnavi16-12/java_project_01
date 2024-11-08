package objectmodelingInheritance;

public class AnimalMain {
	public static void main (String [] arg) {
		Animal [] animals = {new Dog(), new Cat(), new Dog()};
		
		for(Animal animal : animals) {
			animal.Sound();
		}
	}

}
