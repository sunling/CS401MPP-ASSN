package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.toList;

public class Stream {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawnz", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

//        List<String> anotherList = menu.stream().filter(d -> {
//            System.out.println("filtering " + d.getName());
//            return d.getCalories() > 300;
//        }).map(d -> {
//            System.out.println("mapping" + d.getName());
//            return d.getName();
//        }).limit(3).collect(toList());
//        System.out.println(anotherList);

        List<Integer> list = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        list.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
//
//        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
//        List<Integer> integers = words.stream().map(String::length).collect(toList());
//        System.out.println(integers);
//
//        List<String> wordList = Arrays.asList("Hello", "World");
//        List<java.util.stream.Stream<String>> characterList = wordList.stream().map(d -> d.split("")).map(Arrays::stream).distinct().collect(toList());
//        BinaryOperator<Integer> operator;
//        int integer = list.stream().reduce(0, Integer::sum);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);
        //System.out.println(max);

    }
}
