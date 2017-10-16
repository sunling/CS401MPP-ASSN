package java8.behaviorparameters;

public class AppleWeightPredicate implements ApplePredicate<Apple> {

	@Override
	public boolean filter(Apple item) {
		// TODO Auto-generated method stub
		return item.getWeight() >150;
	}

}
