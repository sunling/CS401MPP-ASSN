package lab8.homework.assignment.prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Solutions {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Arraa");
		list.add("santas");
		list.add("CubAA");
		list.add("AAAYu");
		Predicate<String> pred = a -> a.contains("A") && !a.contains("y") && a.length() == 5; 
		System.out.println(countWords(list, pred));
	
	}

	public static <T, U, R> int countWords(List<String> words, Predicate<String> pre) {
		List<String> arrayList = new ArrayList();
		for (String string : arrayList) {
			if (pre.test(string)) {
				arrayList.add(string);
			}
		}
		return arrayList.size();
	}
}
