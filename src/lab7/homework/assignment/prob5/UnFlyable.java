package lab7.homework.assignment.prob5;

public interface UnFlyable  extends FlyBehavior{
	
	default void fly(){
		System.out.println("UnFlyable");
	}

}
