package lab3.homework.assignment.problemtwo;

import java.util.List;

public class Landlord {
	private String name;
	private List<Building> listOfBuilding;

	public Landlord(String name,List<Building> listOfBuilding) {
		this.name = name;
		this.listOfBuilding = listOfBuilding;
	}

	public List<Building> getBuildings() {
		return listOfBuilding;
	}
	
	public String getName(){
		return name;
	}
}
