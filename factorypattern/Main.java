package factorypattern;

public class Main {
	public static void main(String[] args) {

		Dog dog = DogStore.getDog("small");
		dog.sayName();
		
		dog = DogStore.getDog("big");
		dog.sayName();
		
		dog = DogStore.getDog("toxic");
		dog.sayName();
	}
}
