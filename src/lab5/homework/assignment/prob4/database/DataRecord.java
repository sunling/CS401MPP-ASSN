package lab5.homework.assignment.prob4.database;

public class DataRecord {
	private String name;
	private String surname;
	
	public DataRecord(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
}
