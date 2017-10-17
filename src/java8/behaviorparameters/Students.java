package java8.behaviorparameters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Students {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("farruh", "03948", "California"));
		list.add(new Student("salim", "895485", "Fairfield"));

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
		studentList(list, s -> s.name.toUpperCase());

	}
	
	public static void studentList(List<Student> list, Functional<Student,String> method){
		for(Student student: list){
			String name = method.take(student);
			System.out.println(name);
		}
	}

}
