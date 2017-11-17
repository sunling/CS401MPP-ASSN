package NewMPP_ASSN.excirces.prob2.exam.partC;

import java.util.Comparator;

//The lambda:   (Long a, Long b) -> a.compareTo(b)
//NOTE: You may NOT type this as a BiFunction
public class PartC {

    //provide a functional interface type for the lambda - do NOT use BiFunction
    MyBiFunction<Long, Long, Integer> functionInterface = (Long a, Long b) -> a.compareTo(b);

    //provide a method reference and the type of method reference
    //TYPE:

    MyBiFunction<Long, Long, Integer> myBiFunction = Long::compare;

    // provide an inner class that behaves the same way as the labmda
    class MyClass implements MyBiFunction<Long, Long, Integer> {
        @Override
        public Integer accept(Long a, Long b) {
            return a.compareTo(b);
        }
    }


    public void evaluator() {
        System.out.println(functionInterface.accept(1L, 4L));
        System.out.println(myBiFunction.accept(12l, 12l));
        System.out.println(new MyClass().accept(14l, 15l));
    }

    public static void main(String[] args) {
        PartC pa = new PartC();
        pa.evaluator();
    }
}
