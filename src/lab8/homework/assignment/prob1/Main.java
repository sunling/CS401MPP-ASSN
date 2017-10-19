package lab8.homework.assignment.prob1;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> Math.random();
		Supplier<Double> supplier = new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
		};

		System.out.println(sup.get());
		System.out.println(supplier.get());
	}
}
	

