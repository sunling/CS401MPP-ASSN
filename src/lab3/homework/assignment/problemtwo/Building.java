package lab3.homework.assignment.problemtwo;

import java.util.List;

public class Building {

	private double maintanenceCost;
	private List<Apartment> listOfApartments;
	
	public Building(double maintanenceCost, List<Apartment> listOfApartments){
		this.maintanenceCost = maintanenceCost;
		this.listOfApartments = listOfApartments;
	}
	
	public double getMaintanenceFee(){
		return maintanenceCost;
	}
	
	public List<Apartment> getListOfApartments(){
		return listOfApartments;
	}
	
}
