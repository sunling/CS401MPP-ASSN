package NewMPP_ASSN.Lab3.prob1.prob4;

public class Condo implements Property{

	int numberOfFloors = 0;
	
	public Condo(int number){
		this.numberOfFloors = number;
	}
	
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return numberOfFloors * 400;
	}

}
