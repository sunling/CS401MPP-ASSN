package java8.generics;

import java.util.Comparator;
import java.util.List;

public class SimpleCheck<T> {

    public <T extends Comparable> T SimpleCheck(List<T> list) {
        return list.stream().max(Comparable::compareTo).get();
    }
}
