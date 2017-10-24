package java8.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimplePair<String, String> simplePair = new SimplePair<>("Hello", "World");
        System.out.println(simplePair.getKey());

//        List<? extends Number> empList = new ArrayList<>();
//        empList.add(new Integer(23));
        //Manager manager = (Manager) empList.get(0);
        //List<Manager> list = new ArrayList<>();

    }
}
