package lab5.homework.assignment.prob4.factory;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;
	
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}
	
	public Person getPerson(){
		return person;
	}
	
	void setPerson(Person person){
		this.person = person;
	}
	
	public LocalDate getDateOfBirth(){
		return dateOfBirth;
	}
}
