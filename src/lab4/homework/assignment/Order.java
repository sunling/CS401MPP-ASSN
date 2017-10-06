package lab4.homework.assignment;

import java.time.LocalDate;

public class Order {
	private String orderNumber;
	private LocalDate orderDate;
	private int  orderAmount;
	
	
	public Order(String orderNumber, LocalDate orderDate, int orderAmount) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	public int orderAmount(){
		return orderAmount;
	}
	
	
}
