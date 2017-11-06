package NewMPP_ASSN.Lab5.prob2;

public class DecoyDuck extends Duck {

	protected DecoyDuck() {
		super(new MuteQuacking(),new FlyWithWing());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" Display");
	}

}
