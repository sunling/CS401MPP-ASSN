package java8.main;

import java.util.ArrayList;
import java.util.List;

public class SecondMain {
	
	public static void main(String[]args){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Ahmad",30));
		list.add(new Employee("Ahmad",21));
		list.add(new Employee("Bekal",22));
		list.add(new Employee("Micheal",18));
		list.add(new Employee("Micheal",17));
		list.add(new Employee("Irma",6));
		
//		list.sort((e1,e2)->{
//			if(e1.name.compareTo())
//		});
	}

}
