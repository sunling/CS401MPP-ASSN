package NewMPP_ASSN.Lab5.prob2;

abstract public class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;
	
	protected Duck(QuackBehavior quackBehavior,FlyBehavior flyBehavior){
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
	}
	
	public abstract void display();
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void quack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.print(" We are swimming now");
	}
}
