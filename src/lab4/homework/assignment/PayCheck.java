package lab4.homework.assignment;

public final class PayCheck {
	private  double grossPay = 0;
	final static double fica = 23;
	final static double state = 5;
	final static double local = 1;
	final static double medicare = 3;
	final static double socialSec = 7.5;
	
	public PayCheck(double grossPay){
		this.grossPay = grossPay;
	}
	public double getGrossPay() {
		return grossPay;
	}
	
	public void print(){
		System.out.println("He has "+grossPay +" gross pay and after deduction  he has "
				+ ""+getNetPay()+" net pay left");
	}
	public double getNetPay(){
		return grossPay * (fica + state + local+medicare + socialSec);
	}
	
	
	
}
