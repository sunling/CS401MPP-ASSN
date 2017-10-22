package lab9.homework.assignment.partOne.three;

import java.util.*;
import java.util.function.*;

public class EmployeeInfoBetter {
	enum SortMethod {BYNAME, BYSALARY};
	static Map<SortMethod, Pair> sortDescriminate = new HashMap<>();

	static {
		sortDescriminate.put(SortMethod.BYNAME, new Pair<>(Employee::getName, Employee::getSalary));
		sortDescriminate.put(SortMethod.BYSALARY, new Pair<>( Employee::getSalary, Employee::getName));
	}

	public void sort(List<Employee> emps, final SortMethod method) {
		Collections.sort(emps,Comparator.comparing(sortDescriminate.get(method).first)
				.thenComparing(sortDescriminate.get(method).second));

	}

	static class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>>{

		final Function<Employee,T> first;
		final Function<Employee,U> second;

		public Pair(Function<Employee, T> first, Function<Employee,U> second) {
			this.first = first;
			this.second = second;
		}

	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, SortMethod.BYSALARY);
		//System.out.println(emps);
	}
}
