/**
 * 
 */
package lab4.homework.assignment;

/**
 * @author farruhhabibullaev
 *
 */
public abstract class Employee {
	
	private String employeeId;
	
	public void print(){
		System.out.println("Employee Abstract Class");
	}
	
	public PayCheck calculateCompensation(int month){
		return new PayCheck(calculateGrossPay());
	}
	
	abstract double calculateGrossPay();
}
