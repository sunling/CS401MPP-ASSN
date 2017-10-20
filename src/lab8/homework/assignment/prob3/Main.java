package lab8.homework.assignment.prob3;

import java.util.function.BiFunction;

public class Main {
	
	public static void main(String[] args){
		BiFunction<Integer,Integer,Integer> biFunc = Integer::compare;
		System.out.println(biFunc.apply(2, 3));
	
	}

}
