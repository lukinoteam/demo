package factorypattern;

public class DogStore {
	public static Dog getDog(String size) {
		switch (size) {
		case "small":
			return new Poodle();
		case "big":
			return new PitBull();
		case "toxic":
			return new Shepherd();
		default:
			return null;
		}
	}
}
