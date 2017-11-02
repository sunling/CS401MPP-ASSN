package NewMPP_ASSN.LessonCodes;

import java.time.LocalDate;

public class Employee {
	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthdate;
	private String SSN;
	private double salary;
	
	
	public void print(){
		System.out.println("Printing Employee");
	}
}
