package lab5.homework.assignment.prob4.factory;

public final class Person {
	private String name;
	private BirthInfo birthInfo;
	Person(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	void setBirthInfo(BirthInfo birthInfo){
		this.birthInfo = birthInfo;
	}
	
	public BirthInfo getBirthInfo(){
		return birthInfo;
	}
	
}
