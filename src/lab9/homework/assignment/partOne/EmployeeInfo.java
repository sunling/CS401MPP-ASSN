package lab9.homework.assignment.partOne;

import java.util.*;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}
	public void sort(List<Employee> emps) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, Comparator.comparing(Employee::getName)
					.thenComparing(Employee::getSalary));
		}
		else if(method == SortMethod.BYSALARY) {
			Collections.sort(emps, Comparator.comparing(Employee::getSalary)
					.thenComparing(Employee::getName));
		}
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
		Employee joe = new Employee("Joe", 100000);
		Employee joe2 = new Employee("Joe2", 200000);
		List<Employee> list = Arrays.asList(joe, joe2);
		Collections.sort(list, new EmployeeNameComparator());
		System.out.println(list);
		
		
		System.out.println("joe equals joe2? " + joe.equals(joe2));
		EmployeeNameComparator c = new EmployeeNameComparator();
		System.out.println("joe equals joe2? " + (c.compare(joe, joe2)==0) );

		

		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);
	}
}
