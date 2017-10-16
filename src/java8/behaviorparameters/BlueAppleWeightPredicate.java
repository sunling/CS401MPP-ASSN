package java8.behaviorparameters;

public class BlueAppleWeightPredicate implements ApplePredicate<Apple> {

	@Override
	public boolean filter(Apple item) {
		// TODO Auto-generated method stub
		return "Red".equals(item.color) && item.weight>150;
	}

}
