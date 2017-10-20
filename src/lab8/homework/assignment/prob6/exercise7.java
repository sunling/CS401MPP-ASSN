package lab8.homework.assignment.prob6;

public class exercise7 {
    public static void main(String[] args) {
        andThen(()->System.out.println("Hello World"),
                ()->System.out.println("Let the world crash")).run();
    }

    public static Runnable andThen(Runnable r1, Runnable r2){
        return () -> {
            r1.run();
            r2.run();
        };
    }
}
