package java8.behaviorparameters;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[]args){
		List<Apple> appleList = new ArrayList<Apple>();
		appleList.add(new Apple("Russian","Red",123));
		appleList.add(new Apple ("Russian","Red",180));
		appleList.add(new Apple("England","Blue",190));
		
		List<Apple> list = filterApple(appleList,(Apple apple)-> 150 > apple.weight);
		for(Apple apple : list){
			System.out.println(apple.name);
		}
		
		List<Apple> listApple = filterApple(appleList, new ApplePredicate<Apple>(){			
			public boolean filter(Apple apple){
				return apple.color.equals("red");
			}
		});
		
		//prettyPrintApple(appleList, new PrintNameAndWeight());
	}
	public static List<Apple> filterApple(List<Apple> list, ApplePredicate<Apple> filterMethod){
		List<Apple> appleList = new ArrayList<Apple>();
		for(Apple apple:list){
			if(filterMethod.filter(apple)){
				appleList.add(apple);
			}
		}
		return appleList;
	}
	
	public static void prettyPrintApple(List<Apple> inventory, PrettyPrintApple filter){
		for(Apple apple: inventory){
			String output = filter.print(apple);
			System.out.println(output);
		}
	}

}
