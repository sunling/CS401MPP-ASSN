package NewMPP_ASSN.Lab3.prob1.prob2;

import java.util.List;

public class Building {
	
	private String number;
	private List<Apartment> apartmentList;
	private double maintenanceFee;
	
	public Building(String number, List<Apartment> apartmentList, double maintenanceFee){
		this.number = number;
		this.apartmentList = apartmentList;
		this.maintenanceFee = maintenanceFee;
	}
	
	public List<Apartment> apartmentList(){
		return apartmentList;
	}
	
	public double getMaintenanceFee(){
		return maintenanceFee;
	}


}
