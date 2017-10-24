package lab11.homework.assignment.prob5;

public class Main {

    public static void main(String[] args) {
        Integer [] arrays = {1,2,3,5,3,53,3};
        System.out.println(getSecondLargest(arrays));
    }

    public static <T extends Comparable<T>> T getSecondLargest(T [] arrays){
        T a = null;
        T b;

        if (arrays.length <= 0) {
            return null;
        }

        b = arrays[0];

        for(T e:arrays){
            if (e.compareTo(b)>0){
                a = b;
                b = e;

            }
        }

        return a;

    }
}
