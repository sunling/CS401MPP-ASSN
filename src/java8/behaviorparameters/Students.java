package java8.behaviorparameters;

import lab3.homework.assignment.problemOne.Person;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Students {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("farruh", "03948", "California"));
		list.add(new Student("falimsdfdsf", "895485", "Fairfield"));
		List<Student> newList = list.stream().filter(name -> name.name.startsWith("f")).filter(name->name.name.length()>6).collect(Collectors.toList());

		newList.forEach(e ->{
			System.out.println(e.name);
		});

		Stream<String> echoes = Stream.generate(()->"Echo").limit(10);
		 echoes.forEach(e -> {
			 System.out.println(e);
		 });

		 Stream<BigInteger> naturalNums = Stream.iterate(BigInteger.ONE,n->n.add(BigInteger.ONE));

		///Map<Integer,String> idToName  = echoes.collect(Collectors.toMap(Person::getName,Person::getName));
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.name.compareTo(o2.name);
//			}
//		});
//
//		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		
		

		// list.forEach(s ->{
		// System.out.println(s.toUpperCase());
		// });
		//
		// list.forEach(new Consumer<Student>(){
		// @Override
		// public void accept(Student t) {
		// System.out.println(t.toUpperCase());
		//
		// }
		// });
		//studentList(list, s -> s.name.toUpperCase());

	}
	
	public static void studentList(List<Student> list, Functional<Student,String> method){
		for(Student student: list){
			String name = method.take(student);
			System.out.println(name);
		}
	}

}
