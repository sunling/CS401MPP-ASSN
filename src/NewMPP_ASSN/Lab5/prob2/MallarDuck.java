package NewMPP_ASSN.Lab5.prob2;

public class MallarDuck extends Duck {

	protected MallarDuck( ) {
		super(new MuteQuacking(), new FlyWithWing());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println(" displaying");
		
	}

}
