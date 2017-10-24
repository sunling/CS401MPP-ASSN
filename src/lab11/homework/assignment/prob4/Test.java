package lab11.homework.assignment.prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums)
            s += num.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);

      //  List<? extends Number> numbers = list;
      //  double ins = sum(list);
        //numbers.add(13.2);
    }
}
