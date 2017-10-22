package lab9.homework.assignment.partTwo.prob7;

import java8.streams.Stream;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		list.stream().filter(e -> e.getSalary() > 100000).filter(e->e.getLastName()
				.startsWith("S")).sorted(Comparator.comparing(Employee::getSalary))
				.forEach(e->System.out.println(e.firstName +" " +e.getLastName()));

	}

}
