package lab7.homework.assignment.prob5;

abstract public class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;
	
	public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
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
		System.out.println("Swimming");
	}
}
