package java8.behaviorparameters;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {
		Consumer<String> s = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);

			}

		};

		// s.accept("Hello");

		Consumer<String> sc = (String string) -> System.out.println(string);
		Consumer<String> scw = string -> System.out.println(string);

		Consumer<String> methodReference = System.out::println;
		methodReference.accept("Hello");

		Consumer<String> methRef =  A::b;
		methRef.accept("Alie");
		
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

		Numbers.findNumbers(list, new BiPredicate<Integer,Integer>(){
			@Override
			public boolean test(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return Numbers.isMoreThanFifty(t, u);
			}
		});
		
		BiPredicate<Integer, Integer> bio = (Integer a, Integer b) -> Numbers.isMoreThanFifty(a, b);
		BiPredicate<Integer, Integer> bio2 = Numbers::isMoreThanFifty;
		List<Integer> integerList = Numbers.findNumbers(list, Numbers::isMoreThanFifty);
		
	}
}
