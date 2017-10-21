package lab9.homework.assignment.partOne.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamEc {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Farruh","Jannie","Jump","Father","Mather");
        Stream<String> stringStream = streamSection(stringList.stream(),2,4);
        System.out.println(stringStream.collect(toList()));
    }

    public static Stream<String> streamSection(Stream<String> stream, int m, int n){
        return stream.skip(m).limit(n);
    }
}
