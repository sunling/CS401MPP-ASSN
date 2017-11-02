package NewMPP_ASSN.LessonCodes;

import java.util.List;

public class Company {
	
	private  String name;
	private List<Department> departmentList;
	
	public Company(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.print("Printing company");
	}
	
	


}
