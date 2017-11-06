package NewMPP_ASSN.Lab5.prob2;
public class Main {

	public static void main(String[] args) {
		Duck[] ducks = 
			{new MallarDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}

	}

}
