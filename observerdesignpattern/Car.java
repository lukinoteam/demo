package observerdesignpattern;

import java.util.ArrayList;

public class Car {
	
	private ArrayList<User> users;
	
	private int price; 
	
	public Car() {
		users = new ArrayList<User>();
		price = 100;
	}
	
	public void setPrice(int price) {
		this.price = price;
		notifyUpdate();
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void removeUser(User user) {
		users.remove(user);
	}
	
	public void notifyUpdate() {
		for (User u : users) {
			u.update();
		}
		
	}
}
