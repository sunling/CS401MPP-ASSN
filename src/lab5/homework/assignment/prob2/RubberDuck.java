package lab5.homework.assignment.prob2;

public class RubberDuck extends Duck {

	protected RubberDuck() {
		super( new Sneaking(),new CannotFly());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying ");
	}

}
