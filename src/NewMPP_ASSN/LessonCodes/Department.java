package NewMPP_ASSN.LessonCodes;

import java.util.List;

public class Department {
	
	private String name;
	private String location;
	private Company company;
	private List<Position> listOfPosition;
	
	
	
	public Department(String name, String location){
		this.name = name;
		this.location = location;
	}
	
	public void print(){
		System.out.print("Printing Department");
	}
	


}
