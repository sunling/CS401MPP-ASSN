package lab11.homework.assignment.prob1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(3));
        List<? extends Number> anotherList = list;
       // anotherList.add(new Integer(12));
    }
}
