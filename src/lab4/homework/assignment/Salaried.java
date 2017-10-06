package lab4.homework.assignment;

public class Salaried extends Employee {
	
	private double salary;
	
	public Salaried(double salary){
		this.salary = salary;
	}
	
	@Override
	public PayCheck calculateCompensation(int month){
		return new PayCheck(month*calculateGrossPay());
	}
	

	double calculateGrossPay() {
		// TODO Auto-generated method stub
		return salary;
	}

}
