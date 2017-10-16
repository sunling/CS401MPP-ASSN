package java8.behaviorparameters;

public class PrintNameAndWeight implements PrettyPrintApple<Apple> {

	@Override
	public String print(Apple apple) {
		// TODO Auto-generated method stub
		return apple.name +" "+ apple.weight;
	}
	
}
