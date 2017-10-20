package lab8.homework.assignment.prob6;

import java.util.ArrayList;
import java.util.List;

public class exercises8 {
    public static void main(String[] args) {
        String[] names = {"Peter","Paul","Mary"};
        List<Runnable> runnables = new ArrayList<>();

        for (String name:names){
            runnables.add(()-> System.out.println(name));
        }

        for(Runnable runnable: runnables){
            runnable.run();
        }

    }
}
