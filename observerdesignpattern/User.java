package observerdesignpattern;

public class User {
	
	private int price;
	
	public User(int price) {
		this.price = price;
	}
	
	public void update() {
		System.out.println("Price Changed!");
	}
	
	public int getPrice() {
		return this.price;
	}
}
