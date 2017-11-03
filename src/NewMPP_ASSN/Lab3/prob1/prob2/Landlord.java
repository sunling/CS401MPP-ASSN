package NewMPP_ASSN.Lab3.prob1.prob2;

import java.util.List;

public class Landlord {

	private List<Building> buildingsList;
	private String name;
	
	public Landlord(String name, List<Building> buildingsList){
		this.name = name;
		this.buildingsList = buildingsList;
	}
	
	public List<Building> getListOfBuilding(){
		return buildingsList;
	}
	
	public String getName(){
		return name;
	}
}
