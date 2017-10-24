package lab11.homework.assignment.extra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyGenerics<Integer> generics = new MyGenerics<>();
        Integer [] values = {1,2,3,4,5,6,7,8};
        System.out.println(generics.countEvenNumbers(values));
        System.out.println(generics.swap(Arrays.asList(values)).get(0));
    }

}
