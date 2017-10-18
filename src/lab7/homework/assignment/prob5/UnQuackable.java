package lab7.homework.assignment.prob5;

public interface UnQuackable extends QuackBehavior {
	default public void quack(){
		System.out.println("Not quackable");
	}
}
