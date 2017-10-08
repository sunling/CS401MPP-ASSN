package lab5.homework.assignment.prob4.factory;

public final class PersonAndBirthInfoImpl implements PersonAndBirthInfo {
	private Person person;
	private BirthInfo birthInfo;
	
	public PersonAndBirthInfoImpl(Person person, BirthInfo birthInfo){
		this.person  = person;
		this.birthInfo = birthInfo;
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		// TODO Auto-generated method stub
		return birthInfo;
	}

}
