package NewMPP_ASSN.lamdaexcirces;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

    public static void main(String[] string) {
        Function<Employee, String> employee = e -> e.getName();
        Function<Employee, String> employee2 = Employee::getName;

        BiConsumer<Employee, String> empSet = (e, s) -> e.setName(s);

        BiFunction<String,String,Integer> comparing = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.compareTo(s2);
            }
        };

        BiFunction<String, String, Integer> comparing2 = (String s, String s2)-> s.compareTo(s2);

        BiFunction<Integer, Integer, Double> mathPower = (i1,i2)->Math.pow(i1,i2);


    }
}
