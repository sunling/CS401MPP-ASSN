/**
 * 
 */
package lab3.homework.assignment.problemtwo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author farruhhabibullaev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Apartment> listOfApartmentOne = new ArrayList<>();
		listOfApartmentOne.add(new Apartment(124.34));
		listOfApartmentOne.add(new Apartment(150.54));
		listOfApartmentOne.add(new Apartment(123.45));
		listOfApartmentOne.add(new Apartment(65.34));
		listOfApartmentOne.add(new Apartment(344.6));

		List<Apartment> listOfApartmentTwo = new ArrayList<>();
		listOfApartmentTwo.add(new Apartment(156.34));
		listOfApartmentTwo.add(new Apartment(170.54));
		listOfApartmentTwo.add(new Apartment(179.45));
		listOfApartmentTwo.add(new Apartment(343.34));
		listOfApartmentTwo.add(new Apartment(38.6));

		List<Building> buildingList = new ArrayList<>();
		buildingList.add(new Building(20.0, listOfApartmentOne));
		buildingList.add(new Building(12.0, listOfApartmentTwo));
		Landlord landlord = new Landlord("Farruh", buildingList);

		double profit = 0.0;

		for (Building building : landlord.getBuildings()) {
			for (Apartment apartment : building.getListOfApartments()) {
				profit += apartment.getRent();
			}
			profit -= building.getMaintanenceFee();

		}

		System.out.println(landlord.getName() + " has a profit of " + profit + " monthly.");

	}

}
