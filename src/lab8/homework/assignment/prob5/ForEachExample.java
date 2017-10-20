package lab8.homework.assignment.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
		list.forEach(s -> System.out.println(s.toUpperCase()));
		
		//Lamba method reference
		list.forEach(System.out::println);
		
	}
	
	//implement a Consumer
	static void print(List<String> list, Consumer<String> pre){
		list.forEach(pre);
	}
	
	
}