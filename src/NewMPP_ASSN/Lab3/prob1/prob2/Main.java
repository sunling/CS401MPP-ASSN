package NewMPP_ASSN.Lab3.prob1.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		Apartment ap1 = new Apartment("12",300);
		Apartment ap2 = new Apartment("23",320);
		Apartment ap3  = new Apartment("21",500);
		
		List<Apartment> apartmentList = new ArrayList<Apartment>();
		apartmentList.add(ap1);
		apartmentList.add(ap2);
		apartmentList.add(ap3);
		
		Building building = new Building("FirstOne",apartmentList,201);
		Building building2 = new Building("SecondOne",apartmentList,230);
		
		List<Building> listOfBuildings = new ArrayList<Building>();
		listOfBuildings.add(building2);
		listOfBuildings.add(building);
		
		Landlord landlord = new Landlord("Farruh",listOfBuildings);
		System.out.println("Landord of "+ landlord.getName()+" has profit of "+ calculateRent(landlord));
	}
	
	static double calculateRent(Landlord landord){
		int sumOfRevenue = 0;
		for(Building building: landord.getListOfBuilding()){
			for(Apartment apartment: building.apartmentList()){
				sumOfRevenue += apartment.getCost();
			}
			sumOfRevenue -= building.getMaintenanceFee();
		}
		return sumOfRevenue;
	}
}
