package NewMPP_ASSN.LessonCodes.onetoone.extpackage;

import NewMPP_ASSN.LessonCodes.onetoone.Customer;
import NewMPP_ASSN.LessonCodes.onetoone.Item;
import NewMPP_ASSN.LessonCodes.onetoone.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		cust.getCart().addItem(new Item("Shirt"));
		
		//not possible to create instance of ShoppingCart outside of a Customer
		//--this is what is meant by "Customer owns the relationship"
		//  new ShoppingCart(...) -- compiler error
		
		System.out.println("Bob's shopping cart: " + cust.getCart().getItems());
		
		//You can navigate from a shopping cart to its owner
		ShoppingCart cart = cust.getCart();
		System.out.println("Owner of cart: " + cart.getOwner());

	}

}
