package lab8.homework.assignment.prob6;

public class excirces6 {
    public static void main(String[] args) {
        new Thread(uncheck(() -> {
            System.out.println("zzz");
            Thread.sleep(10000);
            System.out.println("No sleep");
        })).start();
    }

    public static Runnable uncheck(RunnableEx runnableEx) {
        return () -> {
            try {
                runnableEx.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

    }
}
