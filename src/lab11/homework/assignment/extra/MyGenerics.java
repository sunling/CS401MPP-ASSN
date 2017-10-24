package lab11.homework.assignment.extra;

import java.util.Arrays;
import java.util.List;

public class MyGenerics<T> {

    //count the number of the generics elements that are even
    public <T extends Number> long countEvenNumbers(T[] numbers) {
        return Arrays.asList(numbers).stream().mapToInt(e -> e.intValue()).filter(e -> e % 2 == 0).count();
    }

    //exchange the last and first elements in array

    public <T> List<T> swap(List<T> list) {
        T temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
        return list;
    }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }


}
