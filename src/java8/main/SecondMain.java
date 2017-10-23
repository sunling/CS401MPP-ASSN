package java8.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Consumer;

public class SecondMain {
	
	public static void main(String[]args) throws ExecutionException, InterruptedException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Ahmad",30));
		list.add(new Employee("Ahmad",21));
		list.add(new Employee("Bekal",22));
		list.add(new Employee("Micheal",18));
		list.add(new Employee("Micheal",17));
		list.add(new Employee("Irma",6));

//		Consumer<Employee> lists = list::add;
//		list.stream().peek(System.out::println).filter(e->e.age>20);

		ForkJoinPool forkJoinPool = new ForkJoinPool(100);
		forkJoinPool.submit(()->{
			list.stream().filter(e->e.age>20).mapToInt(Employee::getAge).sum();
		}).get();

		
//		list.sort((e1,e2)->{
//			if(e1.name.compareTo())
//		});
	}
	
	public void handleFile(File f) throws FileNotFoundException, IOException{
		try(BufferedReader buf = new BufferedReader(new FileReader(f))){
			
		}
	}

}
