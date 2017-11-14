package NewMPP_ASSN.LessonCodes.onetomany;

//Customer "owns" the 1-1 relationship with ShoppingCart
public class Customer {
	
	private String name;
	private ShoppingCart cart;
	
	public Customer(String name) {
		this.name = name;
		cart = new ShoppingCart(this);
		
	}
	public String getName() {
		return name;
	}
	public ShoppingCart getCart() {
		return cart;
	}
}
