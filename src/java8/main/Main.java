package java8.main;

import java.util.function.*;

class Main {
	
	public static int square(int x) {
		return x * x;
	}
	
	public static class Person {
		public final String name;

		public Person(String name) {
			this.name = name;
		}
		
		public String hello() {
			return "hello " + name;
		}
		
		public String hello(String greeting) {
			return greeting + " " + name;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		Function<Integer, Integer> f1 = (Integer x) -> {
			return Main.square(x);
		};
		
		Function<Integer, Integer> f2 = Main::square;
		
		Function<Person, String> f3 = (Person p) -> p.hello();
		
		Function<Person, String> f4 = Person::hello;
		
		BiFunction<Person, String, String> f5 = (Person p, String greeting) -> p.hello(greeting);
		BiFunction<Person, String, String> f6 = Person::hello;
		
		Person p = new Person("Salim");
		Function<String, String> f7 = p::hello;
		
	}
}