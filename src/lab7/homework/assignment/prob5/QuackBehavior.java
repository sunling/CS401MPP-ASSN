package lab7.homework.assignment.prob5;

public interface QuackBehavior {
	default public void quack(){
		System.out.println("Quacking");
	}
}
