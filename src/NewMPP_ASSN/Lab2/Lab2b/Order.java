package NewMPP_ASSN.Lab2.Lab2b;

import java.util.List;

public class Order {

	private List<OrderLine> orderLineList;
	private String orderNumber;
	
	public Order(List<OrderLine> orderLines){
		this.orderLineList = orderLines;
	}
}
