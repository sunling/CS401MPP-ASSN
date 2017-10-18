package lab7.homework.assignment.prob5;

public interface Flyable extends FlyBehavior{
	
	public default void fly(){
		System.out.println("Flyable");
	}
}
