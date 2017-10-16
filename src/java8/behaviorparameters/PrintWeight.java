package java8.behaviorparameters;

public class PrintWeight implements PrettyPrintApple<Apple> {

	@Override
	public String print(Apple apple) {
		// TODO Auto-generated method stub
		return String.valueOf(apple.weight);
	}

}
