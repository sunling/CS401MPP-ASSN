package NewMPP_ASSN.MMPSTANDARD.prob2;

abstract public class Student {
	
	private String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public abstract double computeGpa();

	public String getName() {
		return name;
	}
	
	
}
