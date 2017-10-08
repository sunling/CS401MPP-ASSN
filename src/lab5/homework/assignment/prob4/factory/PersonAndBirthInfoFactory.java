package lab5.homework.assignment.prob4.factory;

import java.time.LocalDate;

public class PersonAndBirthInfoFactory {
	private PersonAndBirthInfoFactory(){};
	
	public static PersonAndBirthInfoImpl createPersonAndBirthInfo(String name, LocalDate dateOfBirth){
		BirthInfo birthInfo = new BirthInfo(dateOfBirth);
		Person person = new Person(name);
		birthInfo.setPerson(person);
		person.setBirthInfo(birthInfo);
		return new PersonAndBirthInfoImpl(person, birthInfo);
		
	}
}
