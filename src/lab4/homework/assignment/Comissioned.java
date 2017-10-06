/**
 * 
 */
package lab4.homework.assignment;

import java.util.List;

/**
 * @author farruhhabibullaev
 *
 */
public class Comissioned extends Employee {
	private final static double commission  = 10;
	private double baseSalary = 0;
	private List<Order> orders;
	
	public Comissioned(double baseSalary, List<Order> orders){
		this.baseSalary = baseSalary;
		this.orders = orders;
		
	}
	
	@Override
	public PayCheck calculateCompensation(int month){
		return new PayCheck(month*calculateGrossPay());
	}
	

	@Override
	double calculateGrossPay() {
		// TODO Auto-generated method stub
		return baseSalary + sumOfAllOrders()*(commission/100);
	}
	
	public int sumOfAllOrders(){
		int sum = 0;
		for(Order order: orders){
			sum += order.orderAmount();
		}
		return sum;
	}
	
	
}
