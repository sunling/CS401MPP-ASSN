package NewMPP_ASSN.LessonCodes.onetomany.extpackage;

import NewMPP_ASSN.LessonCodes.onetomany.Customer;

public class Main {  

	public static void main(String[] args) {
		Customer cust1 = new Customer("Bob");
		cust1.getCart().addItem("Shirt");
		cust1.getCart().addItem("Pants");
		
		//not possible to create instance of an Item outside of a ShoppingCart
		
		System.out.println("Customer's shopping cart: " + cust1.getCart());

	}

}
