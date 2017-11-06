/**
 * 
 */
package NewMPP_ASSN.Lab4.C;

/**
 * @author farruhhabibullaev
 *
 */
public class Hourly extends Employee {
	
	private double hourlyWage;
	private double hoursPerWeek;
	
	
	public Hourly(double hourlyWage, double hoursPerWeek){
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public PayCheck calculateCompensation(int month){
		return new PayCheck(4*month*calculateGrossPay());
	}
	
	@Override
	double calculateGrossPay() {
		// TODO Auto-generated method stub
		return hourlyWage*hoursPerWeek;
	}
	
	

}
