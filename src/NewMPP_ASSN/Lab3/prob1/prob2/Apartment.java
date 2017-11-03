package NewMPP_ASSN.Lab3.prob1.prob2;

public class Apartment {
	
	private String buildingNumber;
	private double cost;
	
	public Apartment(String buildingNumber, double cost){
		this.buildingNumber = buildingNumber;
		this.cost = cost;
	}
	
	public double getCost(){
		return cost;
	}

}
